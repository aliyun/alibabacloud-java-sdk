// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodTagResourcesResponseBody body;

    public static DescribeVodTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodTagResourcesResponse self = new DescribeVodTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodTagResourcesResponse setBody(DescribeVodTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodTagResourcesResponseBody getBody() {
        return this.body;
    }

}
