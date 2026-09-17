// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingInstanceImageShrinkRequest extends TeaModel {
    /**
     * <p>The image ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-bp15om9lg9zb20magg86</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The list of cloud application service instance IDs. A maximum of 100 IDs can be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RenderingInstanceIds")
    public String renderingInstanceIdsShrink;

    public static UpgradeRenderingInstanceImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingInstanceImageShrinkRequest self = new UpgradeRenderingInstanceImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingInstanceImageShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeRenderingInstanceImageShrinkRequest setRenderingInstanceIdsShrink(String renderingInstanceIdsShrink) {
        this.renderingInstanceIdsShrink = renderingInstanceIdsShrink;
        return this;
    }
    public String getRenderingInstanceIdsShrink() {
        return this.renderingInstanceIdsShrink;
    }

}
