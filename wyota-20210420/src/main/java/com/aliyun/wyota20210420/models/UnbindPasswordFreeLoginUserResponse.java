// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UnbindPasswordFreeLoginUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindPasswordFreeLoginUserResponseBody body;

    public static UnbindPasswordFreeLoginUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindPasswordFreeLoginUserResponse self = new UnbindPasswordFreeLoginUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindPasswordFreeLoginUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindPasswordFreeLoginUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindPasswordFreeLoginUserResponse setBody(UnbindPasswordFreeLoginUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindPasswordFreeLoginUserResponseBody getBody() {
        return this.body;
    }

}
