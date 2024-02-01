// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPv6TranslatorAclListsResponseBody body;

    public static DescribeIPv6TranslatorAclListsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorAclListsResponse self = new DescribeIPv6TranslatorAclListsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorAclListsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPv6TranslatorAclListsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPv6TranslatorAclListsResponse setBody(DescribeIPv6TranslatorAclListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPv6TranslatorAclListsResponseBody getBody() {
        return this.body;
    }

}
