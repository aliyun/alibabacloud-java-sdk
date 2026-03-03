// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PdpImage extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-v12wpq</p>
     */
    @NameInMap("imageId")
    public String imageId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20220421100717_prepub</p>
     */
    @NameInMap("imageTag")
    public String imageTag;

    public static PdpImage build(java.util.Map<String, ?> map) throws Exception {
        PdpImage self = new PdpImage();
        return TeaModel.build(map, self);
    }

    public PdpImage setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public PdpImage setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

}
