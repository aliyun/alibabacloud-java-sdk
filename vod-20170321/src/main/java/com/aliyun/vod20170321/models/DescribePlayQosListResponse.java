// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayQosListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlayQosListResponseBody body;

    public static DescribePlayQosListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQosListResponse self = new DescribePlayQosListResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayQosListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayQosListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayQosListResponse setBody(DescribePlayQosListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayQosListResponseBody getBody() {
        return this.body;
    }

}
