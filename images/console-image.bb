SUMMARY = "A console development image customized for the rpi"
HOMEPAGE = "http://www.jumpnowtek.com"

require images/basic-dev-image.bb


WIFI = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
"


RPI_STUFF = " \
    userland \
"

IMAGE_INSTALL_append = " \
    ${RPI_STUFF} \
    ${WIFI} \
"


export IMAGE_BASENAME = "console-image"
