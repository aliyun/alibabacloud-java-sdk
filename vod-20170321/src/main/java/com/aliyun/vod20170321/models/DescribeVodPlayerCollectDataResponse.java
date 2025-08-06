// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerCollectDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodPlayerCollectDataResponseBody body;

    public static DescribeVodPlayerCollectDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerCollectDataResponse self = new DescribeVodPlayerCollectDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerCollectDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodPlayerCollectDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodPlayerCollectDataResponse setBody(DescribeVodPlayerCollectDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodPlayerCollectDataResponseBody getBody() {
        return this.body;
    }

}
