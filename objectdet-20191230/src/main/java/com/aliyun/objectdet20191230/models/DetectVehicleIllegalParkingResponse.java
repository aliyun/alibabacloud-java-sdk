// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleIllegalParkingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVehicleIllegalParkingResponseBody body;

    public static DetectVehicleIllegalParkingResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleIllegalParkingResponse self = new DetectVehicleIllegalParkingResponse();
        return TeaModel.build(map, self);
    }

    public DetectVehicleIllegalParkingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVehicleIllegalParkingResponse setBody(DetectVehicleIllegalParkingResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVehicleIllegalParkingResponseBody getBody() {
        return this.body;
    }

}
