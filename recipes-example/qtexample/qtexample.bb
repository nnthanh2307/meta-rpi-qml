SUMMARY = "Simple Qt5 Quick application"
SECTION = "examples"
LICENSE = "MIT"
LICENSE = "CLOSED"
DEPENDS += "qtbase qtdeclarative qtquickcontrols2"
SRCREV = "bf7bd0c462cf2d760278ae0a4fed9c36e11f3fba"
SRC_URI = "git://github.com/shigmas/BasicQuick.git"
S = "${WORKDIR}/git"
require recipes-qt/qt5/qt5.inc

do_install() {
      install -d ${D}${bindir}
      install -m 0755 BasicQuick ${D}${bindir}
}
