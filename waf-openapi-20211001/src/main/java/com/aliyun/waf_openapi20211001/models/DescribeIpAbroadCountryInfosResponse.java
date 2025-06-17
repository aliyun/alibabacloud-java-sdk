// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeIpAbroadCountryInfosResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIpAbroadCountryInfosResponseBody body;

    public static DescribeIpAbroadCountryInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAbroadCountryInfosResponse self = new DescribeIpAbroadCountryInfosResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIpAbroadCountryInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIpAbroadCountryInfosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIpAbroadCountryInfosResponse setBody(DescribeIpAbroadCountryInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIpAbroadCountryInfosResponseBody getBody() {
        return this.body;
    }

}
