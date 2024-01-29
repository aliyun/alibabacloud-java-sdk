// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterModificationHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterModificationHistoryResponseBody body;

    public static DescribeParameterModificationHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterModificationHistoryResponse self = new DescribeParameterModificationHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterModificationHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterModificationHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterModificationHistoryResponse setBody(DescribeParameterModificationHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterModificationHistoryResponseBody getBody() {
        return this.body;
    }

}
