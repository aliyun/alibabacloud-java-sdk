// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class AddPcdnControlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddPcdnControlRuleResponseBody body;

    public static AddPcdnControlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPcdnControlRuleResponse self = new AddPcdnControlRuleResponse();
        return TeaModel.build(map, self);
    }

    public AddPcdnControlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPcdnControlRuleResponse setBody(AddPcdnControlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPcdnControlRuleResponseBody getBody() {
        return this.body;
    }

}
