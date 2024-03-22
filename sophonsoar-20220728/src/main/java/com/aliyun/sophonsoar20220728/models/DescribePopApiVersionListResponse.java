// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiVersionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePopApiVersionListResponseBody body;

    public static DescribePopApiVersionListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiVersionListResponse self = new DescribePopApiVersionListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePopApiVersionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePopApiVersionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePopApiVersionListResponse setBody(DescribePopApiVersionListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePopApiVersionListResponseBody getBody() {
        return this.body;
    }

}
