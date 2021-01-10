// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetClriskRuleResponseBody body;

    public static GetClriskRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleResponse self = new GetClriskRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClriskRuleResponse setBody(GetClriskRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClriskRuleResponseBody getBody() {
        return this.body;
    }

}
