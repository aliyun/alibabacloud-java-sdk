// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayTopVideosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePlayTopVideosResponseBody body;

    public static DescribePlayTopVideosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayTopVideosResponse self = new DescribePlayTopVideosResponse();
        return TeaModel.build(map, self);
    }

    public DescribePlayTopVideosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePlayTopVideosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePlayTopVideosResponse setBody(DescribePlayTopVideosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePlayTopVideosResponseBody getBody() {
        return this.body;
    }

}
