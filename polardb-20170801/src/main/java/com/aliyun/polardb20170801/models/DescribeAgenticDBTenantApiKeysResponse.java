// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBTenantApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBTenantApiKeysResponseBody body;

    public static DescribeAgenticDBTenantApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBTenantApiKeysResponse self = new DescribeAgenticDBTenantApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBTenantApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBTenantApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBTenantApiKeysResponse setBody(DescribeAgenticDBTenantApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBTenantApiKeysResponseBody getBody() {
        return this.body;
    }

}
