// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeParametersHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParametersHistoryResponseBody body;

    public static DescribeParametersHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParametersHistoryResponse self = new DescribeParametersHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParametersHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParametersHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParametersHistoryResponse setBody(DescribeParametersHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParametersHistoryResponseBody getBody() {
        return this.body;
    }

}
