#
# Copyright (c) 2023 Joel Winarske. All rights reserved.
#

SUMMARY = "Movidius USB Rule"
AUTHOR = "Joel Winarske"
SECTION = "support"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://80-movidius.rules"

S = "${WORKDIR}/sources"
UNPACKDIR = "${S}"

do_install () {
    install -Dm0666 ${UNPACKDIR}/80-movidius.rules ${D}/etc/udev/rules.d/80-movidius.rules
}    

FILES:${PN} += "/etc/udev/rules.d"
