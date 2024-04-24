// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceNamesResponseBody body;

    public static DescribeDefenseResourceNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceNamesResponse self = new DescribeDefenseResourceNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceNamesResponse setBody(DescribeDefenseResourceNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceNamesResponseBody getBody() {
        return this.body;
    }

}
