// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkValidateStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SdkValidateStatusResponseBody body;

    public static SdkValidateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkValidateStatusResponse self = new SdkValidateStatusResponse();
        return TeaModel.build(map, self);
    }

    public SdkValidateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkValidateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkValidateStatusResponse setBody(SdkValidateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkValidateStatusResponseBody getBody() {
        return this.body;
    }

}
