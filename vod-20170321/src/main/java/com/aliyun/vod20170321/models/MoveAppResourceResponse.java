// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class MoveAppResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveAppResourceResponseBody body;

    public static MoveAppResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveAppResourceResponse self = new MoveAppResourceResponse();
        return TeaModel.build(map, self);
    }

    public MoveAppResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveAppResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveAppResourceResponse setBody(MoveAppResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveAppResourceResponseBody getBody() {
        return this.body;
    }

}
