ifconfig wlan0 192.168.1.100
wpa_passphrase DoomHose lincoln-@ve_H0us3 > /etc/wpa_supplicant.conf
route add default gw 192.168.1.1
wpa_supplicant -B -i wlan0 -c /etc/wpa_supplicant.conf
