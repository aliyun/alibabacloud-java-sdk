// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20180117.models;

import com.aliyun.tea.*;

public class DescribeAclRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAclRulesResponseBody body;

    public static DescribeAclRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclRulesResponse self = new DescribeAclRulesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAclRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAclRulesResponse setBody(DescribeAclRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAclRulesResponseBody getBody() {
        return this.body;
    }

}
