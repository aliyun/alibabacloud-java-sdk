// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainStagingConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainStagingConfigResponseBody body;

    public static DescribeVodDomainStagingConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainStagingConfigResponse self = new DescribeVodDomainStagingConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainStagingConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainStagingConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainStagingConfigResponse setBody(DescribeVodDomainStagingConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainStagingConfigResponseBody getBody() {
        return this.body;
    }

}
