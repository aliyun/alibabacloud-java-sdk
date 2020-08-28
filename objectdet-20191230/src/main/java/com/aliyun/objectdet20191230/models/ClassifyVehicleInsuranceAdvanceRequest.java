// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static ClassifyVehicleInsuranceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceAdvanceRequest self = new ClassifyVehicleInsuranceAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
