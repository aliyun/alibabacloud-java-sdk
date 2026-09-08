// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class CreateDataMaskingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataMaskingRuleResponseBody body;

    public static CreateDataMaskingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataMaskingRuleResponse self = new CreateDataMaskingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataMaskingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataMaskingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataMaskingRuleResponse setBody(CreateDataMaskingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataMaskingRuleResponseBody getBody() {
        return this.body;
    }

}
