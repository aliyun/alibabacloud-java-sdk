// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingServerImageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>m-9timxhrrgopkec8ju</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Precheck")
    public Boolean precheck;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;render-30d593fb042946c58568316956624c6b&quot;]</p>
     */
    @NameInMap("RenderingInstanceIds")
    public String renderingInstanceIdsShrink;

    public static UpgradeRenderingServerImageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingServerImageShrinkRequest self = new UpgradeRenderingServerImageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingServerImageShrinkRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeRenderingServerImageShrinkRequest setPrecheck(Boolean precheck) {
        this.precheck = precheck;
        return this;
    }
    public Boolean getPrecheck() {
        return this.precheck;
    }

    public UpgradeRenderingServerImageShrinkRequest setRenderingInstanceIdsShrink(String renderingInstanceIdsShrink) {
        this.renderingInstanceIdsShrink = renderingInstanceIdsShrink;
        return this;
    }
    public String getRenderingInstanceIdsShrink() {
        return this.renderingInstanceIdsShrink;
    }

}
