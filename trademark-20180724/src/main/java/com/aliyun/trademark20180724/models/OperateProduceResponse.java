// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class OperateProduceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateProduceResponseBody body;

    public static OperateProduceResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceResponse self = new OperateProduceResponse();
        return TeaModel.build(map, self);
    }

    public OperateProduceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateProduceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateProduceResponse setBody(OperateProduceResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateProduceResponseBody getBody() {
        return this.body;
    }

}
