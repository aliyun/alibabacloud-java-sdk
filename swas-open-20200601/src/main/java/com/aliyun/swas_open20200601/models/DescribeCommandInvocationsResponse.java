// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeCommandInvocationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCommandInvocationsResponseBody body;

    public static DescribeCommandInvocationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommandInvocationsResponse self = new DescribeCommandInvocationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommandInvocationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommandInvocationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCommandInvocationsResponse setBody(DescribeCommandInvocationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommandInvocationsResponseBody getBody() {
        return this.body;
    }

}
