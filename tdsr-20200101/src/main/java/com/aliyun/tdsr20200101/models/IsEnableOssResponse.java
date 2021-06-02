// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class IsEnableOssResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IsEnableOssResponseBody body;

    public static IsEnableOssResponse build(java.util.Map<String, ?> map) throws Exception {
        IsEnableOssResponse self = new IsEnableOssResponse();
        return TeaModel.build(map, self);
    }

    public IsEnableOssResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IsEnableOssResponse setBody(IsEnableOssResponseBody body) {
        this.body = body;
        return this;
    }
    public IsEnableOssResponseBody getBody() {
        return this.body;
    }

}
