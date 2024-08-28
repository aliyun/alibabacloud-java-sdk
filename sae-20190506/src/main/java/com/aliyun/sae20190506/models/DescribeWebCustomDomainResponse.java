// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeWebCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WebCustomDomain body;

    public static DescribeWebCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebCustomDomainResponse self = new DescribeWebCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebCustomDomainResponse setBody(WebCustomDomain body) {
        this.body = body;
        return this;
    }
    public WebCustomDomain getBody() {
        return this.body;
    }

}
