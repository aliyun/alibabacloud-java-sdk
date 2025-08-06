// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserQuotaResponseBody body;

    public static DescribeVodUserQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserQuotaResponse self = new DescribeVodUserQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserQuotaResponse setBody(DescribeVodUserQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserQuotaResponseBody getBody() {
        return this.body;
    }

}
