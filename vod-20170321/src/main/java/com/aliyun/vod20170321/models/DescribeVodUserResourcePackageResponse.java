// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodUserResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVodUserResourcePackageResponseBody body;

    public static DescribeVodUserResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodUserResourcePackageResponse self = new DescribeVodUserResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVodUserResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVodUserResourcePackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVodUserResourcePackageResponse setBody(DescribeVodUserResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVodUserResourcePackageResponseBody getBody() {
        return this.body;
    }

}
