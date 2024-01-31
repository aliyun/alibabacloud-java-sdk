// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeIpTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpTagsResponseBody body;

    public static DescribeIpTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpTagsResponse self = new DescribeIpTagsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpTagsResponse setBody(DescribeIpTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpTagsResponseBody getBody() {
        return this.body;
    }

}
