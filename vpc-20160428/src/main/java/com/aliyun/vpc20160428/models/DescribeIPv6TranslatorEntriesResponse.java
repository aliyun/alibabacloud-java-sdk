// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeIPv6TranslatorEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIPv6TranslatorEntriesResponseBody body;

    public static DescribeIPv6TranslatorEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPv6TranslatorEntriesResponse self = new DescribeIPv6TranslatorEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIPv6TranslatorEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIPv6TranslatorEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIPv6TranslatorEntriesResponse setBody(DescribeIPv6TranslatorEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIPv6TranslatorEntriesResponseBody getBody() {
        return this.body;
    }

}
