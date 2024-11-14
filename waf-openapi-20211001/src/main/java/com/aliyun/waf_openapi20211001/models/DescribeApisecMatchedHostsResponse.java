// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecMatchedHostsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecMatchedHostsResponseBody body;

    public static DescribeApisecMatchedHostsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecMatchedHostsResponse self = new DescribeApisecMatchedHostsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecMatchedHostsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecMatchedHostsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecMatchedHostsResponse setBody(DescribeApisecMatchedHostsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecMatchedHostsResponseBody getBody() {
        return this.body;
    }

}
