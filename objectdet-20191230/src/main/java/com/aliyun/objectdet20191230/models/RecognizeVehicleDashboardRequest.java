// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDashboardRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static RecognizeVehicleDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDashboardRequest self = new RecognizeVehicleDashboardRequest();
        return TeaModel.build(map, self);
    }

}
