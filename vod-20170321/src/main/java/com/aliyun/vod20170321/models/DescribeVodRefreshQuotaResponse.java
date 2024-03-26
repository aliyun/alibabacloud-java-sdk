// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodRefreshQuotaResponseBody body;

    public static DescribeVodRefreshQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodRefreshQuotaResponse self = new DescribeVodRefreshQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodRefreshQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodRefreshQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodRefreshQuotaResponse setBody(DescribeVodRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
