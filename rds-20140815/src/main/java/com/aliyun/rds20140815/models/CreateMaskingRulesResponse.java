// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateMaskingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMaskingRulesResponseBody body;

    public static CreateMaskingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMaskingRulesResponse self = new CreateMaskingRulesResponse();
        return TeaModel.build(map, self);
    }

    public CreateMaskingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMaskingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMaskingRulesResponse setBody(CreateMaskingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMaskingRulesResponseBody getBody() {
        return this.body;
    }

}
