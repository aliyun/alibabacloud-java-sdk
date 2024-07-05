// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeStreamVodListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStreamVodListResponseBody body;

    public static DescribeStreamVodListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStreamVodListResponse self = new DescribeStreamVodListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStreamVodListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStreamVodListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStreamVodListResponse setBody(DescribeStreamVodListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStreamVodListResponseBody getBody() {
        return this.body;
    }

}
