// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectVehicleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleRequest self = new DetectVehicleRequest();
        return TeaModel.build(map, self);
    }

}
