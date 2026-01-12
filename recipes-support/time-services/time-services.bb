SUMMARY = "Time Services"
DESCRIPTION = "Time-services Daemon to sync time from Modem to APPS \
and maintain time across reboots (even if the modem is not network camped)."

HOMEPAGE = "https://github.com/KyleDengChunkai/time-services"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=65b8cd575e75211d9d4ca8603167da1c"

DEPENDS += "glib-2.0 qmi-framework"

SRCREV = "54620a9d343f659c14551707d6a0f7835a7fa00c"

SRC_URI = "git://github.com/KyleDengChunkai/time-services.git;protocol=https;branch=main"

inherit autotools pkgconfig
