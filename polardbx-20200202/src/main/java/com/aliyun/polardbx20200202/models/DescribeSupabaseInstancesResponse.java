// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupabaseInstancesResponseBody body;

    public static DescribeSupabaseInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseInstancesResponse self = new DescribeSupabaseInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupabaseInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupabaseInstancesResponse setBody(DescribeSupabaseInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupabaseInstancesResponseBody getBody() {
        return this.body;
    }

}
