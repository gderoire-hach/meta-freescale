require imx-gpu-viv-6.inc

DEPENDS:append:libc-musl = " gcompat"
INSANE_SKIP:append:libc-musl = " file-rdeps"

SRC_URI[md5sum] = "22de8a5f59a56a7ef499f590d1659b6f"
SRC_URI[sha256sum] = "52921c0b59529f1598084e991eda1863100754f28a7744ba958158dff8074b3b"

COMPATIBLE_MACHINE = "(mx8-nxp-bsp)"
