// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeHybridCloudGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeHybridCloudGroupsResponseBody body;

    public static DescribeHybridCloudGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridCloudGroupsResponse self = new DescribeHybridCloudGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHybridCloudGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeHybridCloudGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeHybridCloudGroupsResponse setBody(DescribeHybridCloudGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeHybridCloudGroupsResponseBody getBody() {
        return this.body;
    }

}
