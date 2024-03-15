// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMedicalDeviceProduceLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeMedicalDeviceProduceLicenseResponseBody body;

    public static RecognizeMedicalDeviceProduceLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMedicalDeviceProduceLicenseResponse self = new RecognizeMedicalDeviceProduceLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMedicalDeviceProduceLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMedicalDeviceProduceLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMedicalDeviceProduceLicenseResponse setBody(RecognizeMedicalDeviceProduceLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMedicalDeviceProduceLicenseResponseBody getBody() {
        return this.body;
    }

}
