// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeDeductionStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDeductionStatisticResponseBody body;

    public static DescribeDeductionStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeductionStatisticResponse self = new DescribeDeductionStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDeductionStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDeductionStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDeductionStatisticResponse setBody(DescribeDeductionStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDeductionStatisticResponseBody getBody() {
        return this.body;
    }

}
