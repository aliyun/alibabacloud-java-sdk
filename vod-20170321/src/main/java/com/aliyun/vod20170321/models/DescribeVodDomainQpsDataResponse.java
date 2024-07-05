// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodDomainQpsDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodDomainQpsDataResponseBody body;

    public static DescribeVodDomainQpsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodDomainQpsDataResponse self = new DescribeVodDomainQpsDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodDomainQpsDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodDomainQpsDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodDomainQpsDataResponse setBody(DescribeVodDomainQpsDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodDomainQpsDataResponseBody getBody() {
        return this.body;
    }

}
