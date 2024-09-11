// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class BindPasswordFreeLoginUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindPasswordFreeLoginUserResponseBody body;

    public static BindPasswordFreeLoginUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindPasswordFreeLoginUserResponse self = new BindPasswordFreeLoginUserResponse();
        return TeaModel.build(map, self);
    }

    public BindPasswordFreeLoginUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindPasswordFreeLoginUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindPasswordFreeLoginUserResponse setBody(BindPasswordFreeLoginUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindPasswordFreeLoginUserResponseBody getBody() {
        return this.body;
    }

}
