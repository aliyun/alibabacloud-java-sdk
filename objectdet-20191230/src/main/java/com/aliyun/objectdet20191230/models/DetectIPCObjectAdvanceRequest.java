// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectIPCObjectAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static DetectIPCObjectAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectIPCObjectAdvanceRequest self = new DetectIPCObjectAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectIPCObjectAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
