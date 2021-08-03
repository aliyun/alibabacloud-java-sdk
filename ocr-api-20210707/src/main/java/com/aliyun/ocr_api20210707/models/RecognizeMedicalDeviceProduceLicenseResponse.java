// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMedicalDeviceProduceLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RecognizeMedicalDeviceProduceLicenseResponse setBody(RecognizeMedicalDeviceProduceLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMedicalDeviceProduceLicenseResponseBody getBody() {
        return this.body;
    }

}
