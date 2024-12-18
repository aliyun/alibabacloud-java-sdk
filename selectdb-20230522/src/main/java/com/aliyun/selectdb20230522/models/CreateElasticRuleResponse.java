// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateElasticRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateElasticRuleResponseBody body;

    public static CreateElasticRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateElasticRuleResponse self = new CreateElasticRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateElasticRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateElasticRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateElasticRuleResponse setBody(CreateElasticRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateElasticRuleResponseBody getBody() {
        return this.body;
    }

}
