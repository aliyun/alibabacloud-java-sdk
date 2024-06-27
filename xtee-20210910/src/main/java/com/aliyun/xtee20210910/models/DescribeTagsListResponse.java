// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagsListResponseBody body;

    public static DescribeTagsListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsListResponse self = new DescribeTagsListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagsListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagsListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagsListResponse setBody(DescribeTagsListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagsListResponseBody getBody() {
        return this.body;
    }

}
