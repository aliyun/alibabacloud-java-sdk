// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class OperateNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateNodeResponseBody body;

    public static OperateNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateNodeResponse self = new OperateNodeResponse();
        return TeaModel.build(map, self);
    }

    public OperateNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateNodeResponse setBody(OperateNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateNodeResponseBody getBody() {
        return this.body;
    }

}
