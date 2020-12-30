// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectVehicleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectVehicleResponseBody body;

    public static DetectVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectVehicleResponse self = new DetectVehicleResponse();
        return TeaModel.build(map, self);
    }

    public DetectVehicleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectVehicleResponse setBody(DetectVehicleResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectVehicleResponseBody getBody() {
        return this.body;
    }

}
