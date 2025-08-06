// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodServiceResponseBody body;

    public static DescribeVodServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodServiceResponse self = new DescribeVodServiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodServiceResponse setBody(DescribeVodServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodServiceResponseBody getBody() {
        return this.body;
    }

}
