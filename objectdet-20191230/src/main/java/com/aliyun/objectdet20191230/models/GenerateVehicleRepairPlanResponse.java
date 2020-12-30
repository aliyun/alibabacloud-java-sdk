// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GenerateVehicleRepairPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateVehicleRepairPlanResponseBody body;

    public static GenerateVehicleRepairPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVehicleRepairPlanResponse self = new GenerateVehicleRepairPlanResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVehicleRepairPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVehicleRepairPlanResponse setBody(GenerateVehicleRepairPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVehicleRepairPlanResponseBody getBody() {
        return this.body;
    }

}
