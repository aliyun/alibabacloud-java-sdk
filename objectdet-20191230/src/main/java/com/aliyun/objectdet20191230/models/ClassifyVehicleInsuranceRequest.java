// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class ClassifyVehicleInsuranceRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static ClassifyVehicleInsuranceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClassifyVehicleInsuranceRequest self = new ClassifyVehicleInsuranceRequest();
        return TeaModel.build(map, self);
    }

    public ClassifyVehicleInsuranceRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
