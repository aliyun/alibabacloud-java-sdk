// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeResourceInstanceCertsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourceInstanceCertsResponseBody body;

    public static DescribeResourceInstanceCertsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceInstanceCertsResponse self = new DescribeResourceInstanceCertsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourceInstanceCertsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourceInstanceCertsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourceInstanceCertsResponse setBody(DescribeResourceInstanceCertsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourceInstanceCertsResponseBody getBody() {
        return this.body;
    }

}
