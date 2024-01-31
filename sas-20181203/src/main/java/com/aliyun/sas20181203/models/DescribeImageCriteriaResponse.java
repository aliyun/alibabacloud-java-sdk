// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageCriteriaResponseBody body;

    public static DescribeImageCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageCriteriaResponse self = new DescribeImageCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageCriteriaResponse setBody(DescribeImageCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageCriteriaResponseBody getBody() {
        return this.body;
    }

}
