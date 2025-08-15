// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class OperateBucketScanTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateBucketScanTaskResponseBody body;

    public static OperateBucketScanTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateBucketScanTaskResponse self = new OperateBucketScanTaskResponse();
        return TeaModel.build(map, self);
    }

    public OperateBucketScanTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateBucketScanTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateBucketScanTaskResponse setBody(OperateBucketScanTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateBucketScanTaskResponseBody getBody() {
        return this.body;
    }

}
