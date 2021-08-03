// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBankAccountLicenseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RecognizeBankAccountLicenseResponseBody body;

    public static RecognizeBankAccountLicenseResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBankAccountLicenseResponse self = new RecognizeBankAccountLicenseResponse();
        return TeaModel.build(map, self);
    }

    public RecognizeBankAccountLicenseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecognizeBankAccountLicenseResponse setBody(RecognizeBankAccountLicenseResponseBody body) {
        this.body = body;
        return this;
    }
    public RecognizeBankAccountLicenseResponseBody getBody() {
        return this.body;
    }

}
