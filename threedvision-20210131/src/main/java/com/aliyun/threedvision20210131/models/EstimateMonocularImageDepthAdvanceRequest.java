// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateMonocularImageDepthAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static EstimateMonocularImageDepthAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EstimateMonocularImageDepthAdvanceRequest self = new EstimateMonocularImageDepthAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public EstimateMonocularImageDepthAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
