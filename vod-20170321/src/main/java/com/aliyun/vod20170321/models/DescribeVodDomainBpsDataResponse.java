// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodDomainBpsDataResponseBody body;

    public static DescribeVodDomainBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataResponse self = new DescribeVodDomainBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainBpsDataResponse setBody(DescribeVodDomainBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainBpsDataResponseBody getBody() {
        return this.body;
    }

}
