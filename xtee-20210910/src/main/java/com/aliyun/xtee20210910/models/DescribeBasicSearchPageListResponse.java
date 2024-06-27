// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeBasicSearchPageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBasicSearchPageListResponseBody body;

    public static DescribeBasicSearchPageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBasicSearchPageListResponse self = new DescribeBasicSearchPageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBasicSearchPageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBasicSearchPageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBasicSearchPageListResponse setBody(DescribeBasicSearchPageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBasicSearchPageListResponseBody getBody() {
        return this.body;
    }

}
