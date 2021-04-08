// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static DetectVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleRequest self = new DetectVehicleRequest();
        return TeaModel.build(map, self);
    }

    public DetectVehicleRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
