#!/bin/bash
# Sostituisci la porta nel file di configurazione di Apache
sed -i "s/Listen 80/Listen ${PORT}/" /etc/apache2/ports.conf
sed -i "s/:80/:${PORT}/g" /etc/apache2/sites-available/000-default.conf

# Avvia Apache in foreground
apache2-foreground
