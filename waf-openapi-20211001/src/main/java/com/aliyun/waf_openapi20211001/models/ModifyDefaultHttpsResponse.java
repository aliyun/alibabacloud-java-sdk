// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefaultHttpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefaultHttpsResponseBody body;

    public static ModifyDefaultHttpsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultHttpsResponse self = new ModifyDefaultHttpsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultHttpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefaultHttpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefaultHttpsResponse setBody(ModifyDefaultHttpsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefaultHttpsResponseBody getBody() {
        return this.body;
    }

}
