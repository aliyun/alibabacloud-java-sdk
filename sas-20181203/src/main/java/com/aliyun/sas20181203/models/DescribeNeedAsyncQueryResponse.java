// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNeedAsyncQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNeedAsyncQueryResponseBody body;

    public static DescribeNeedAsyncQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNeedAsyncQueryResponse self = new DescribeNeedAsyncQueryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNeedAsyncQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNeedAsyncQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNeedAsyncQueryResponse setBody(DescribeNeedAsyncQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNeedAsyncQueryResponseBody getBody() {
        return this.body;
    }

}
