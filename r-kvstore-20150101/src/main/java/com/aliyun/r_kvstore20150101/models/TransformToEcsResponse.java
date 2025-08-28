// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class TransformToEcsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransformToEcsResponseBody body;

    public static TransformToEcsResponse build(java.util.Map<String, ?> map) throws Exception {
        TransformToEcsResponse self = new TransformToEcsResponse();
        return TeaModel.build(map, self);
    }

    public TransformToEcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransformToEcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransformToEcsResponse setBody(TransformToEcsResponseBody body) {
        this.body = body;
        return this;
    }
    public TransformToEcsResponseBody getBody() {
        return this.body;
    }

}
