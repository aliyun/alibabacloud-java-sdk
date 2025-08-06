// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeUserVodStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserVodStatusResponseBody body;

    public static DescribeUserVodStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVodStatusResponse self = new DescribeUserVodStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserVodStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserVodStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserVodStatusResponse setBody(DescribeUserVodStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserVodStatusResponseBody getBody() {
        return this.body;
    }

}
