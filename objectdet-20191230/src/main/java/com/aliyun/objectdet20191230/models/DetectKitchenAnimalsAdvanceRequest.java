// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectKitchenAnimalsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLAObject")
    @Validation(required = true)
    public java.io.InputStream imageURLAObject;

    @NameInMap("ImageURLB")
    public String imageURLB;

    public static DetectKitchenAnimalsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKitchenAnimalsAdvanceRequest self = new DetectKitchenAnimalsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectKitchenAnimalsAdvanceRequest setImageURLAObject(java.io.InputStream imageURLAObject) {
        this.imageURLAObject = imageURLAObject;
        return this;
    }
    public java.io.InputStream getImageURLAObject() {
        return this.imageURLAObject;
    }

    public DetectKitchenAnimalsAdvanceRequest setImageURLB(String imageURLB) {
        this.imageURLB = imageURLB;
        return this;
    }
    public String getImageURLB() {
        return this.imageURLB;
    }

}
