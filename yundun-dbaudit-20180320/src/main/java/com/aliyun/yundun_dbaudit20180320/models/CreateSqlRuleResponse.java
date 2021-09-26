// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class CreateSqlRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSqlRuleResponseBody body;

    public static CreateSqlRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlRuleResponse self = new CreateSqlRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlRuleResponse setBody(CreateSqlRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlRuleResponseBody getBody() {
        return this.body;
    }

}
