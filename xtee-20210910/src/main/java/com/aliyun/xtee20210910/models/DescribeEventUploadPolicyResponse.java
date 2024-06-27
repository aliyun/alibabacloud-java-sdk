// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventUploadPolicyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEventUploadPolicyResponseBody body;

    public static DescribeEventUploadPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventUploadPolicyResponse self = new DescribeEventUploadPolicyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEventUploadPolicyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEventUploadPolicyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEventUploadPolicyResponse setBody(DescribeEventUploadPolicyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEventUploadPolicyResponseBody getBody() {
        return this.body;
    }

}
