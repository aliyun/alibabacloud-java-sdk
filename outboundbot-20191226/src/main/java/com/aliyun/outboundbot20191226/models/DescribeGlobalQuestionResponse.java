// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DescribeGlobalQuestionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGlobalQuestionResponseBody body;

    public static DescribeGlobalQuestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGlobalQuestionResponse self = new DescribeGlobalQuestionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGlobalQuestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGlobalQuestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGlobalQuestionResponse setBody(DescribeGlobalQuestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGlobalQuestionResponseBody getBody() {
        return this.body;
    }

}
