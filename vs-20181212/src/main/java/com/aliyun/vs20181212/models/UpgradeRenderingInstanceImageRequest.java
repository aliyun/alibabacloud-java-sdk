// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingInstanceImageRequest extends TeaModel {
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
    public java.util.List<String> renderingInstanceIds;

    public static UpgradeRenderingInstanceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingInstanceImageRequest self = new UpgradeRenderingInstanceImageRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingInstanceImageRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpgradeRenderingInstanceImageRequest setRenderingInstanceIds(java.util.List<String> renderingInstanceIds) {
        this.renderingInstanceIds = renderingInstanceIds;
        return this;
    }
    public java.util.List<String> getRenderingInstanceIds() {
        return this.renderingInstanceIds;
    }

}
