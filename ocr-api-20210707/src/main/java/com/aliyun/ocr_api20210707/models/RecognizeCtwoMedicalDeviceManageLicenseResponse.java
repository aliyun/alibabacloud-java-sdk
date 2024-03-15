// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeCtwoMedicalDeviceManageLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RecognizeCtwoMedicalDeviceManageLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeCtwoMedicalDeviceManageLicenseResponse setBody(RecognizeCtwoMedicalDeviceManageLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeCtwoMedicalDeviceManageLicenseResponseBody getBody() {
        return this.body;
    }

}
