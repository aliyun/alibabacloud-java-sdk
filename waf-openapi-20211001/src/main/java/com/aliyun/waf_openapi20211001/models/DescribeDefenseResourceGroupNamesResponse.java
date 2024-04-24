// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeDefenseResourceGroupNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefenseResourceGroupNamesResponseBody body;

    public static DescribeDefenseResourceGroupNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefenseResourceGroupNamesResponse self = new DescribeDefenseResourceGroupNamesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefenseResourceGroupNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefenseResourceGroupNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefenseResourceGroupNamesResponse setBody(DescribeDefenseResourceGroupNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefenseResourceGroupNamesResponseBody getBody() {
        return this.body;
    }

}
