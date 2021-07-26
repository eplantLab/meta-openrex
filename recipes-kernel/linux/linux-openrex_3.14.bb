# Copyright (C) 2015, 2016 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

#PV .= "+git${SRCPV}"

SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

#Always update SRCREV based on your last commit
SRCREV = "6a6ef7d7e85ee9d54e5a70e8d01d8e24dd1a9714"

SRC_URI = "git://github.com/eplantLab/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"



COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
