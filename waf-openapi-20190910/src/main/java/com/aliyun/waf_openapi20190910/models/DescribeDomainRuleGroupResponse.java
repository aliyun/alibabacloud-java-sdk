// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDomainRuleGroupResponseBody body;

    public static DescribeDomainRuleGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRuleGroupResponse self = new DescribeDomainRuleGroupResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRuleGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainRuleGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDomainRuleGroupResponse setBody(DescribeDomainRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRuleGroupResponseBody getBody() {
        return this.body;
    }

}
