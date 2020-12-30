// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    public static RecognizeVehicleDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardRequest self = new RecognizeVehicleDashboardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDashboardRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

}
