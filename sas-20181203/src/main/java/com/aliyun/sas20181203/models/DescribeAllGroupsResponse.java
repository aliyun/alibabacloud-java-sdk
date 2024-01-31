// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAllGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAllGroupsResponseBody body;

    public static DescribeAllGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAllGroupsResponse self = new DescribeAllGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAllGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAllGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAllGroupsResponse setBody(DescribeAllGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAllGroupsResponseBody getBody() {
        return this.body;
    }

}
