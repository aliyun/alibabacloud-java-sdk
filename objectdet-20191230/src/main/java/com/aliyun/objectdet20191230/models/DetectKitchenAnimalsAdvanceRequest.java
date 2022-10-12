// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectKitchenAnimalsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLA")
    public java.io.InputStream imageURLAObject;

    @NameInMap("ImageURLB")
    public java.io.InputStream imageURLBObject;

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

    public DetectKitchenAnimalsAdvanceRequest setImageURLBObject(java.io.InputStream imageURLBObject) {
        this.imageURLBObject = imageURLBObject;
        return this;
    }
    public java.io.InputStream getImageURLBObject() {
        return this.imageURLBObject;
    }

}
