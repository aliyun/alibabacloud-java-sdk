// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.tea.*;

public class DescribeDomainRuleGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDomainRuleGroupResponse setBody(DescribeDomainRuleGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainRuleGroupResponseBody getBody() {
        return this.body;
    }

}
