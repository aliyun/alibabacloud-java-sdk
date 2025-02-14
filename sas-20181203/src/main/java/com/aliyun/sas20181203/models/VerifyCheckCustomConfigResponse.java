// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class VerifyCheckCustomConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VerifyCheckCustomConfigResponseBody body;

    public static VerifyCheckCustomConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyCheckCustomConfigResponse self = new VerifyCheckCustomConfigResponse();
        return TeaModel.build(map, self);
    }

    public VerifyCheckCustomConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VerifyCheckCustomConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VerifyCheckCustomConfigResponse setBody(VerifyCheckCustomConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public VerifyCheckCustomConfigResponseBody getBody() {
        return this.body;
    }

}
