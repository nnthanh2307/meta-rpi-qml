SUMMARY = "Simple Qt5 Quick QDashBoard"
SECTION = "QDashBoard"
LICENSE = "MIT"
LICENSE = "CLOSED"
DEPENDS += "qtbase qtdeclarative qtquickcontrols2 "
SRCREV = "8c901bf63d64d2b9a2441193e40b0c09b592ea8f"
SRC_URI = "git://github.com/arielmol/particleBenchmarkTest.git"
S = "${WORKDIR}/git"
require recipes-qt/qt5/qt5.inc

do_install() {
      install -d ${D}${bindir}
      install -m 0755 simpleParticleTest ${D}${bindir}
}
