// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPv6TranslatorAclListAttributesResponseBody body;

    public static DescribeIPv6TranslatorAclListAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListAttributesResponse self = new DescribeIPv6TranslatorAclListAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPv6TranslatorAclListAttributesResponse setBody(DescribeIPv6TranslatorAclListAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPv6TranslatorAclListAttributesResponseBody getBody() {
        return this.body;
    }

}
