// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeUserLangResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeUserLangResponseBody body;

    public static ChangeUserLangResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeUserLangResponse self = new ChangeUserLangResponse();
        return TeaModel.build(map, self);
    }

    public ChangeUserLangResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeUserLangResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeUserLangResponse setBody(ChangeUserLangResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeUserLangResponseBody getBody() {
        return this.body;
    }

}
