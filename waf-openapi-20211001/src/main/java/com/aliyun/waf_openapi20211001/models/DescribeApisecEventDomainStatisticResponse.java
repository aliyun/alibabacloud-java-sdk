// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecEventDomainStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecEventDomainStatisticResponseBody body;

    public static DescribeApisecEventDomainStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecEventDomainStatisticResponse self = new DescribeApisecEventDomainStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecEventDomainStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecEventDomainStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecEventDomainStatisticResponse setBody(DescribeApisecEventDomainStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecEventDomainStatisticResponseBody getBody() {
        return this.body;
    }

}
