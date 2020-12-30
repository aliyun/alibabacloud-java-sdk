// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectTransparentImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectTransparentImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectTransparentImageAdvanceRequest self = new DetectTransparentImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectTransparentImageAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
