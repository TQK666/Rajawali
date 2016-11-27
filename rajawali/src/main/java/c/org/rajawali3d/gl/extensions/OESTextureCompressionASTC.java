package c.org.rajawali3d.gl.extensions;

import android.support.annotation.NonNull;

import c.org.rajawali3d.gl.Capabilities;

/**
 * Adaptive Scalable Texture Compression (ASTC) is a new texture compression technology that offers unprecendented
 * flexibility, while producing better or comparable results than existing texture compressions at all bit rates. It
 * includes support for 2D and slice-based 3D textures, with low and high dynamic range, at bitrates from below 1
 * bit/pixel up to 8 bits/pixel in fine steps.
 *
 * The goal of these extensions is to support the full 2D profile of the ASTC texture compression specification, and
 * allow construction of 3D textures from multiple compressed 2D slices.
 *
 * ASTC-compressed textures are handled in OpenGL ES and OpenGL by adding new supported formats to the existing commands
 * for defining and updating compressed textures, and defining the interaction of the ASTC formats with each texture
 * target.
 *
 * Some of the functionality of these extensions is not supported if the underlying implementation does not support cube map array textures.
 *
 * @author Jared Woolston (Jared.Woolston@gmail.com)
 *
 * @see <a href="https://www.khronos.org/registry/gles/extensions/OES/OES_texture_compression_astc.txt">
 *     OES_texture_compression_astc</a>
 */
public class OESTextureCompressionASTC implements GLExtension {

    public static final String name = "GL_OES_texture_compression_astc";

    // Accepted by the<internalformat> parameter of CompressedTexImage2D, CompressedTexSubImage2D, CompressedTexImage3D,
    // CompressedTexSubImage3D, TexStorage2D,TextureStorage2D,TexStorage3D, and TextureStorage3D. If extension
    // "EXT_texture_storage" is supported, these tokens are also accepted by TexStorage2DEXT,TextureStorage2DEXT,
    // TexStorage3DEXT and TextureStorage3DEXT.
    public final int COMPRESSED_RGBA_ASTC_4x4_KHR = 0x93B0;
    public final int COMPRESSED_RGBA_ASTC_5x4_KHR = 0x93B1;
    public final int COMPRESSED_RGBA_ASTC_5x5_KHR = 0x93B2;
    public final int COMPRESSED_RGBA_ASTC_6x5_KHR = 0x93B3;
    public final int COMPRESSED_RGBA_ASTC_6x6_KHR = 0x93B4;
    public final int COMPRESSED_RGBA_ASTC_8x5_KHR = 0x93B5;
    public final int COMPRESSED_RGBA_ASTC_8x6_KHR = 0x93B6;
    public final int COMPRESSED_RGBA_ASTC_8x8_KHR = 0x93B7;
    public final int COMPRESSED_RGBA_ASTC_10x5_KHR = 0x93B8;
    public final int COMPRESSED_RGBA_ASTC_10x6_KHR = 0x93B9;
    public final int COMPRESSED_RGBA_ASTC_10x8_KHR = 0x93BA;
    public final int COMPRESSED_RGBA_ASTC_10x10_KHR = 0x93BB;
    public final int COMPRESSED_RGBA_ASTC_12x10_KHR = 0x93BC;
    public final int COMPRESSED_RGBA_ASTC_12x12_KHR = 0x93BD;

    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_4x4_KHR = 0x93D0;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_5x4_KHR = 0x93D1;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_5x5_KHR = 0x93D2;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_6x5_KHR = 0x93D3;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_6x6_KHR = 0x93D4;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x5_KHR = 0x93D5;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x6_KHR = 0x93D6;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_8x8_KHR = 0x93D7;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x5_KHR = 0x93D8;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x6_KHR = 0x93D9;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x8_KHR = 0x93DA;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_10x10_KHR = 0x93DB;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_12x10_KHR = 0x93DC;
    public final int COMPRESSED_SRGB8_ALPHA8_ASTC_12x12_KHR = 0x93DD;

    @NonNull
    public static OESTextureCompressionASTC load() throws Capabilities.UnsupportedCapabilityException {
        return new OESTextureCompressionASTC();
    }

    private OESTextureCompressionASTC() throws Capabilities.UnsupportedCapabilityException {
        Capabilities.getInstance().verifyExtension(name);
    }

    @NonNull
    @Override
    public String getName() {
        return name;
    }
}
