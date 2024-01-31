// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageRepoCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeImageRepoCriteriaResponseBody body;

    public static DescribeImageRepoCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageRepoCriteriaResponse self = new DescribeImageRepoCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeImageRepoCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeImageRepoCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeImageRepoCriteriaResponse setBody(DescribeImageRepoCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeImageRepoCriteriaResponseBody getBody() {
        return this.body;
    }

}
