// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class GetVehicleRepairPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetVehicleRepairPlanResponseBody body;

    public static GetVehicleRepairPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVehicleRepairPlanResponse self = new GetVehicleRepairPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetVehicleRepairPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVehicleRepairPlanResponse setBody(GetVehicleRepairPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVehicleRepairPlanResponseBody getBody() {
        return this.body;
    }

}
