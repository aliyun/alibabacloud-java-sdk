// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorAclListsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeIPv6TranslatorAclListsResponse setBody(DescribeIPv6TranslatorAclListsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPv6TranslatorAclListsResponseBody getBody() {
        return this.body;
    }

}
