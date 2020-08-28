// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeVehicleDamageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageRequest self = new RecognizeVehicleDamageRequest();
        return TeaModel.build(map, self);
    }

}
