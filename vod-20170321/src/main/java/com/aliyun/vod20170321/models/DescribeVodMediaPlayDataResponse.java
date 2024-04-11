// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodMediaPlayDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodMediaPlayDataResponseBody body;

    public static DescribeVodMediaPlayDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodMediaPlayDataResponse self = new DescribeVodMediaPlayDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodMediaPlayDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodMediaPlayDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodMediaPlayDataResponse setBody(DescribeVodMediaPlayDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodMediaPlayDataResponseBody getBody() {
        return this.body;
    }

}
