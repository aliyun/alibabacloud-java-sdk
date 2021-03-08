// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodRefreshQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeVodRefreshQuotaResponse setBody(DescribeVodRefreshQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodRefreshQuotaResponseBody getBody() {
        return this.body;
    }

}
