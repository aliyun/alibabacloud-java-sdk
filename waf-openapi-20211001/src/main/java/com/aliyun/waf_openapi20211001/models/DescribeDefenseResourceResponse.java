// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceResponseBody body;

    public static DescribeDefenseResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceResponse self = new DescribeDefenseResourceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceResponse setBody(DescribeDefenseResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceResponseBody getBody() {
        return this.body;
    }

}
