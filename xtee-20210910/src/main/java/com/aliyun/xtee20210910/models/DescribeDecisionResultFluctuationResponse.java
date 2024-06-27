// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultFluctuationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDecisionResultFluctuationResponseBody body;

    public static DescribeDecisionResultFluctuationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultFluctuationResponse self = new DescribeDecisionResultFluctuationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultFluctuationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDecisionResultFluctuationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDecisionResultFluctuationResponse setBody(DescribeDecisionResultFluctuationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDecisionResultFluctuationResponseBody getBody() {
        return this.body;
    }

}
