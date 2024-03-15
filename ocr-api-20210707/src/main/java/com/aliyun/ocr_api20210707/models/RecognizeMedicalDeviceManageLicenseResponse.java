// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMedicalDeviceManageLicenseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecognizeMedicalDeviceManageLicenseResponseBody body;

    public static RecognizeMedicalDeviceManageLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMedicalDeviceManageLicenseResponse self = new RecognizeMedicalDeviceManageLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeMedicalDeviceManageLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeMedicalDeviceManageLicenseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecognizeMedicalDeviceManageLicenseResponse setBody(RecognizeMedicalDeviceManageLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeMedicalDeviceManageLicenseResponseBody getBody() {
        return this.body;
    }

}
