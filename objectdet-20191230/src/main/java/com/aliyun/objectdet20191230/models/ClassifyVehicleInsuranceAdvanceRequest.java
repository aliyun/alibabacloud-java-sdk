// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public java.io.InputStream imageURLObject;

    public static ClassifyVehicleInsuranceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceAdvanceRequest self = new ClassifyVehicleInsuranceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public ClassifyVehicleInsuranceAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

}
