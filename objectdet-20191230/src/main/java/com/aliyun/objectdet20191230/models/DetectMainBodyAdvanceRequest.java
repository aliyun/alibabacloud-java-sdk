// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectMainBodyAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyAdvanceRequest self = new DetectMainBodyAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectMainBodyAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
