// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingRunHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDataMaskingRunHistoryResponseBody body;

    public static DescribeDataMaskingRunHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingRunHistoryResponse self = new DescribeDataMaskingRunHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingRunHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataMaskingRunHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataMaskingRunHistoryResponse setBody(DescribeDataMaskingRunHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataMaskingRunHistoryResponseBody getBody() {
        return this.body;
    }

}
