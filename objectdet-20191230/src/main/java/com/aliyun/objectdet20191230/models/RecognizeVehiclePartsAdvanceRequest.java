// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static RecognizeVehiclePartsAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsAdvanceRequest self = new RecognizeVehiclePartsAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehiclePartsAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
