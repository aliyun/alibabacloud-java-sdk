// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupabaseInstanceAttributeResponseBody body;

    public static DescribeSupabaseInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseInstanceAttributeResponse self = new DescribeSupabaseInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupabaseInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupabaseInstanceAttributeResponse setBody(DescribeSupabaseInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupabaseInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
