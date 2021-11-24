// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainSrcBpsDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVodDomainSrcBpsDataResponseBody body;

    public static DescribeVodDomainSrcBpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainSrcBpsDataResponse self = new DescribeVodDomainSrcBpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainSrcBpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainSrcBpsDataResponse setBody(DescribeVodDomainSrcBpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainSrcBpsDataResponseBody getBody() {
        return this.body;
    }

}
