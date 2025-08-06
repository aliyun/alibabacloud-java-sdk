// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodStatisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodStatisResponseBody body;

    public static DescribeVodStatisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodStatisResponse self = new DescribeVodStatisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodStatisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodStatisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodStatisResponse setBody(DescribeVodStatisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodStatisResponseBody getBody() {
        return this.body;
    }

}
