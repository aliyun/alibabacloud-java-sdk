// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static RecognizeVehicleDashboardAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardAdvanceRequest self = new RecognizeVehicleDashboardAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDashboardAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
