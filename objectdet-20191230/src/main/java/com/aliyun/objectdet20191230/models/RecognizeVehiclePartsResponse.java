// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class RecognizeVehiclePartsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeVehiclePartsResponseBody body;

    public static RecognizeVehiclePartsResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehiclePartsResponse self = new RecognizeVehiclePartsResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehiclePartsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehiclePartsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVehiclePartsResponse setBody(RecognizeVehiclePartsResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehiclePartsResponseBody getBody() {
        return this.body;
    }

}
