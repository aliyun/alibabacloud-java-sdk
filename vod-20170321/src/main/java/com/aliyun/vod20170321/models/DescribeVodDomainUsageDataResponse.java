// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainUsageDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodDomainUsageDataResponseBody body;

    public static DescribeVodDomainUsageDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainUsageDataResponse self = new DescribeVodDomainUsageDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainUsageDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainUsageDataResponse setBody(DescribeVodDomainUsageDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainUsageDataResponseBody getBody() {
        return this.body;
    }

}
