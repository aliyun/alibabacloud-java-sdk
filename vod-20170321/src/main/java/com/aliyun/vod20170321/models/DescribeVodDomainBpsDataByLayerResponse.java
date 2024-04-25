// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainBpsDataByLayerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainBpsDataByLayerResponseBody body;

    public static DescribeVodDomainBpsDataByLayerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainBpsDataByLayerResponse self = new DescribeVodDomainBpsDataByLayerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainBpsDataByLayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainBpsDataByLayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainBpsDataByLayerResponse setBody(DescribeVodDomainBpsDataByLayerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainBpsDataByLayerResponseBody getBody() {
        return this.body;
    }

}
