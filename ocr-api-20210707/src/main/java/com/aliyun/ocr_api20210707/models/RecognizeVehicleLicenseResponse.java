// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeVehicleLicenseResponseBody body;

    public static RecognizeVehicleLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleLicenseResponse self = new RecognizeVehicleLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeVehicleLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeVehicleLicenseResponse setBody(RecognizeVehicleLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleLicenseResponseBody getBody() {
        return this.body;
    }

}
