// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ChangeLogoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ChangeLogoResponseBody body;

    public static ChangeLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeLogoResponse self = new ChangeLogoResponse();
        return TeaModel.build(map, self);
    }

    public ChangeLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeLogoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeLogoResponse setBody(ChangeLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeLogoResponseBody getBody() {
        return this.body;
    }

}
