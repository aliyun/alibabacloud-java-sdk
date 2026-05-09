// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBatchTasksResponseBody body;

    public static DescribeBatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchTasksResponse self = new DescribeBatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBatchTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBatchTasksResponse setBody(DescribeBatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBatchTasksResponseBody getBody() {
        return this.body;
    }

}
