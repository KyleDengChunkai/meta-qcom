SUMMARY = "Time Services"
DESCRIPTION = "Time-services Daemon to sync time from Modem to APPS \
and maintain time across reboots (even if the modem is not network camped)."

inherit pkgconfig autotools
QMIF_CFLAGS_DIR = "${STAGING_INCDIR}"
EXTRA_OECONF += "QMIF_CFLAGS_DIR='${QMIF_CFLAGS_DIR}'"

HOMEPAGE = "https://github.com/quic/time-services"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65b8cd575e75211d9d4ca8603167da1c"

DEPENDS += "qmi-framework"
DEPENDS += "glib-2.0" 

SRCREV = "3e1a63707c8da4c0ea21fccb123fd0020bb2d90a"
SRC_URI = "git://github.com/quic/time-services.git;protocol=https;branch=main"

