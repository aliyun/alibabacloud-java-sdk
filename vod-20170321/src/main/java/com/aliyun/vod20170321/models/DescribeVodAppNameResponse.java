// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodAppNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodAppNameResponseBody body;

    public static DescribeVodAppNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodAppNameResponse self = new DescribeVodAppNameResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodAppNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodAppNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodAppNameResponse setBody(DescribeVodAppNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodAppNameResponseBody getBody() {
        return this.body;
    }

}
