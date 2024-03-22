// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePopApiItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePopApiItemListResponseBody body;

    public static DescribePopApiItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePopApiItemListResponse self = new DescribePopApiItemListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePopApiItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePopApiItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePopApiItemListResponse setBody(DescribePopApiItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePopApiItemListResponseBody getBody() {
        return this.body;
    }

}
