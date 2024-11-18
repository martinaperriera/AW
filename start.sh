#!/bin/bash
# Sostituisci la porta nel file di configurazione di Apache
sed -i "s/Listen 80/Listen ${1000}/" /etc/apache2/ports.conf
sed -i "s/:80/:${1000}/g" /etc/apache2/sites-available/000-default.conf

# Avvia Apache in foreground
apache2-foreground
