// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTargetResponseBody body;

    public static DescribeTargetResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTargetResponse self = new DescribeTargetResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTargetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTargetResponse setBody(DescribeTargetResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTargetResponseBody getBody() {
        return this.body;
    }

}
