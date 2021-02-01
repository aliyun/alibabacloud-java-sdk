// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleICongestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DetectVehicleICongestionResponse setBody(DetectVehicleICongestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVehicleICongestionResponseBody getBody() {
        return this.body;
    }

}
