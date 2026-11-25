// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingServerImageRequest extends TeaModel {
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
    public java.util.List<String> renderingInstanceIds;

    public static UpgradeRenderingServerImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingServerImageRequest self = new UpgradeRenderingServerImageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingServerImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeRenderingServerImageRequest setPrecheck(Boolean precheck) {
        this.precheck = precheck;
        return this;
    }
    public Boolean getPrecheck() {
        return this.precheck;
    }

    public UpgradeRenderingServerImageRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
