// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectKitchenAnimalsRequest extends TeaModel {
    @NameInMap("ImageURLA")
    public String imageURLA;

    @NameInMap("ImageURLB")
    public String imageURLB;

    public static DetectKitchenAnimalsRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectKitchenAnimalsRequest self = new DetectKitchenAnimalsRequest();
        return TeaModel.build(map, self);
    }

    public DetectKitchenAnimalsRequest setImageURLA(String imageURLA) {
        this.imageURLA = imageURLA;
        return this;
    }
    public String getImageURLA() {
        return this.imageURLA;
    }

    public DetectKitchenAnimalsRequest setImageURLB(String imageURLB) {
        this.imageURLB = imageURLB;
        return this;
    }
    public String getImageURLB() {
        return this.imageURLB;
    }

}
