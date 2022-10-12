// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehicleDamageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVehicleDamageResponseBody body;

    public static RecognizeVehicleDamageResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleDamageResponse self = new RecognizeVehicleDamageResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleDamageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleDamageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVehicleDamageResponse setBody(RecognizeVehicleDamageResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleDamageResponseBody getBody() {
        return this.body;
    }

}
