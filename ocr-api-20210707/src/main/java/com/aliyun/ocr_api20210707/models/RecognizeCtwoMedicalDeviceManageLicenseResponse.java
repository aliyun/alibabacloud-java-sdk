// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCtwoMedicalDeviceManageLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody body;

    public static RecognizeCtwoMedicalDeviceManageLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeCtwoMedicalDeviceManageLicenseResponse self = new RecognizeCtwoMedicalDeviceManageLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse setBody(RecognizeCtwoMedicalDeviceManageLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody getBody() {
        return this.body;
    }

}
