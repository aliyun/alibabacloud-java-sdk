// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryODPJobsSqlbatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetryODPJobsSqlbatchResponseBody body;

    public static RetryODPJobsSqlbatchResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryODPJobsSqlbatchResponse self = new RetryODPJobsSqlbatchResponse();
        return TeaModel.build(map, self);
    }

    public RetryODPJobsSqlbatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryODPJobsSqlbatchResponse setBody(RetryODPJobsSqlbatchResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryODPJobsSqlbatchResponseBody getBody() {
        return this.body;
    }

}
