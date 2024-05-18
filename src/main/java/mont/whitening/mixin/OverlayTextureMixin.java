package mont.whitening.mixin;

import net.minecraft.client.render.OverlayTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(OverlayTexture.class)
public class OverlayTextureMixin {
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = -1308622593))
    private int color(int value) {
        return 16777215;
    }
}
