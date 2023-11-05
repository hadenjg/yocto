DESCRIPTION = "Wiring pi library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
#repo address
SRC_URI = "git://github.com/WiringPi/WiringPi.git;protocol=https;branch=master;"
SRCREV = "f97a6230160b819e6daea7eb242404afa708e421"
S = "${WORKDIR}/git"
MY_DESTINATION = "/home/root/wiringpi"
inherit allarch

do_install(){
    install -d ${D}${MY_DESTINATION}
    cp -r ${S} ${D}${MY_DESTINATION}
}

FILES:${PN} += "${MY_DESTINATION}"

RDEPENDS:${PN} += "perl bash"


# post script will somehow get into the folder I created and ./build
