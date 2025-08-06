// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainRegionDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainRegionDataResponseBody body;

    public static DescribeVodDomainRegionDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainRegionDataResponse self = new DescribeVodDomainRegionDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainRegionDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainRegionDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainRegionDataResponse setBody(DescribeVodDomainRegionDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainRegionDataResponseBody getBody() {
        return this.body;
    }

}
