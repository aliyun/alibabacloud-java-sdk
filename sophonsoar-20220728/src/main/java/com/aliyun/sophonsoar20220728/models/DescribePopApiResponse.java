// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePopApiResponseBody body;

    public static DescribePopApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiResponse self = new DescribePopApiResponse();
        return TeaModel.build(map, self);
    }

    public DescribePopApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePopApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePopApiResponse setBody(DescribePopApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePopApiResponseBody getBody() {
        return this.body;
    }

}
