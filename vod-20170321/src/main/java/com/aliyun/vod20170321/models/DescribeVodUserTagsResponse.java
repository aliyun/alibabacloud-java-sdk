// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserTagsResponseBody body;

    public static DescribeVodUserTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserTagsResponse self = new DescribeVodUserTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserTagsResponse setBody(DescribeVodUserTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserTagsResponseBody getBody() {
        return this.body;
    }

}
