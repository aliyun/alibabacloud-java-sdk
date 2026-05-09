// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBatchTaskResponseBody body;

    public static DescribeBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTaskResponse self = new DescribeBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBatchTaskResponse setBody(DescribeBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchTaskResponseBody getBody() {
        return this.body;
    }

}
