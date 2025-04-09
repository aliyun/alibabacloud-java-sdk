// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeTTSDemoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTTSDemoResponseBody body;

    public static DescribeTTSDemoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTTSDemoResponse self = new DescribeTTSDemoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTTSDemoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTTSDemoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTTSDemoResponse setBody(DescribeTTSDemoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTTSDemoResponseBody getBody() {
        return this.body;
    }

}
