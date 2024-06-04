// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeApisecAbnormalDomainStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApisecAbnormalDomainStatisticResponseBody body;

    public static DescribeApisecAbnormalDomainStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisecAbnormalDomainStatisticResponse self = new DescribeApisecAbnormalDomainStatisticResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApisecAbnormalDomainStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApisecAbnormalDomainStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApisecAbnormalDomainStatisticResponse setBody(DescribeApisecAbnormalDomainStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApisecAbnormalDomainStatisticResponseBody getBody() {
        return this.body;
    }

}
