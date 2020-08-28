// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static ClassifyVehicleInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceRequest self = new ClassifyVehicleInsuranceRequest();
        return TeaModel.build(map, self);
    }

}
