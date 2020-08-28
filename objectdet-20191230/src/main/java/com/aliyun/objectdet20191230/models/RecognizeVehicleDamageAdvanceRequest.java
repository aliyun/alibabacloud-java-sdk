// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeVehicleDamageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageAdvanceRequest self = new RecognizeVehicleDamageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
