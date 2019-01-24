##################################################################################################################################
###
###   Receita didática para o software HELLOMAKE
###   Esta receita tem o objetivo de orientar didaticamente o desenvolvedor a criar um software e instalá-lo em uma distribuição linux 
###   customizada.
###################################################################################################################################
SUMMARY = "Receita para criar e instalar o software HELLOMAKE utilizando o arquivo Makefile para compilar o software."

SECTION = "examples"
PRIORITY = "OPTIONAL"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "\ 
    file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302 \
"

SRC_URI = "file://${P}.tar.gz"

EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' 'CFLAGS=${CFLAGS} -I${S}/. -DWITHOUT_XATTR' 'BUILDDIR=${S}'"

TARGET_CC_ARCH += "${LDFLAGS}"

do_install() {
  oe_runmake install DESTDIR=${D} BINDIR=${bindir} SBINDIR=${sbindir} MANDIR=${mandir} INCLUDEDIR=${includedir}
}
