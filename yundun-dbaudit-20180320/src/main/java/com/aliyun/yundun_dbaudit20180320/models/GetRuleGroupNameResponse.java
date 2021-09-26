// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRuleGroupNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRuleGroupNameResponseBody body;

    public static GetRuleGroupNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRuleGroupNameResponse self = new GetRuleGroupNameResponse();
        return TeaModel.build(map, self);
    }

    public GetRuleGroupNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRuleGroupNameResponse setBody(GetRuleGroupNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRuleGroupNameResponseBody getBody() {
        return this.body;
    }

}
