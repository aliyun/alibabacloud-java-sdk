// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SbjOperateNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SbjOperateNewResponseBody body;

    public static SbjOperateNewResponse build(java.util.Map<String, ?> map) throws Exception {
        SbjOperateNewResponse self = new SbjOperateNewResponse();
        return TeaModel.build(map, self);
    }

    public SbjOperateNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SbjOperateNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SbjOperateNewResponse setBody(SbjOperateNewResponseBody body) {
        this.body = body;
        return this;
    }
    public SbjOperateNewResponseBody getBody() {
        return this.body;
    }

}
