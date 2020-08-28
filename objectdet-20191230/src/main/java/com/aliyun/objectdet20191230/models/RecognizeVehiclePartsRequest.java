// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeVehiclePartsRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsRequest self = new RecognizeVehiclePartsRequest();
        return TeaModel.build(map, self);
    }

}
