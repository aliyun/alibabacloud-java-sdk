// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVehicleICongestionResponseBody body;

    public static DetectVehicleICongestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleICongestionResponse self = new DetectVehicleICongestionResponse();
        return TeaModel.build(map, self);
    }

    public DetectVehicleICongestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVehicleICongestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectVehicleICongestionResponse setBody(DetectVehicleICongestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVehicleICongestionResponseBody getBody() {
        return this.body;
    }

}
