// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class ReconstructBodyBySingleImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ReconstructBodyBySingleImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReconstructBodyBySingleImageAdvanceRequest self = new ReconstructBodyBySingleImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ReconstructBodyBySingleImageAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
