// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCImageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCImageListResponseBody body;

    public static DescribeRCImageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCImageListResponse self = new DescribeRCImageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCImageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCImageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCImageListResponse setBody(DescribeRCImageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCImageListResponseBody getBody() {
        return this.body;
    }

}
