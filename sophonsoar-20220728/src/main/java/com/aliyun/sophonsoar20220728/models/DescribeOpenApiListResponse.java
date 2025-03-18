// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenApiListResponseBody body;

    public static DescribeOpenApiListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiListResponse self = new DescribeOpenApiListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenApiListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenApiListResponse setBody(DescribeOpenApiListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenApiListResponseBody getBody() {
        return this.body;
    }

}
