// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeVehicleLicenseResponse setBody(RecognizeVehicleLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeVehicleLicenseResponseBody getBody() {
        return this.body;
    }

}
