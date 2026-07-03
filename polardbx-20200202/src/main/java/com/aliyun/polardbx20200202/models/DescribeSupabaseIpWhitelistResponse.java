// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseIpWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupabaseIpWhitelistResponseBody body;

    public static DescribeSupabaseIpWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseIpWhitelistResponse self = new DescribeSupabaseIpWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseIpWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupabaseIpWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupabaseIpWhitelistResponse setBody(DescribeSupabaseIpWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupabaseIpWhitelistResponseBody getBody() {
        return this.body;
    }

}
