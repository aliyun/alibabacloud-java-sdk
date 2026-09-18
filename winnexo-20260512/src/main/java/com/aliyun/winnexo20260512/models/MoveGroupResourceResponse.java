// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MoveGroupResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveGroupResourceResponseBody body;

    public static MoveGroupResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveGroupResourceResponse self = new MoveGroupResourceResponse();
        return TeaModel.build(map, self);
    }

    public MoveGroupResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveGroupResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveGroupResourceResponse setBody(MoveGroupResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveGroupResourceResponseBody getBody() {
        return this.body;
    }

}
