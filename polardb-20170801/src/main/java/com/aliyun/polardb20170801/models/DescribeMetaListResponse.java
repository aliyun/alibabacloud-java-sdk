// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMetaListResponseBody body;

    public static DescribeMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListResponse self = new DescribeMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMetaListResponse setBody(DescribeMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMetaListResponseBody getBody() {
        return this.body;
    }

}
