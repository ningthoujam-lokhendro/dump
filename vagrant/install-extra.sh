#!/bin/bash
#
# Description: This is used in the vagrant setup.
#
# Supported distributions: Debian, Ubuntu, CentOS.
#
#
# Usage: $ sudo bash install-extra.sh
echo "Updating system..."
sudo apt-get update --force-yes -y
sudo apt-get install --force-yes -y apache2
service apache2 restart
sudo apt-get install --force-yes -y curl
sudo apt-get install --force-yes -y vim
sudo apt-get install --force-yes -y input-utils
sudo apt-get install --force-yes -y android-tools-adb android-tools-fastboot
curl -sL https://deb.nodesource.com/setup | sudo bash -
sudo apt-get install --force-yes -y nodejs
sudo apt-get install --force-yes -y build-essential