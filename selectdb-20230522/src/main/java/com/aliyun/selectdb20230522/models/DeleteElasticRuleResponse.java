// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class DeleteElasticRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteElasticRuleResponseBody body;

    public static DeleteElasticRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteElasticRuleResponse self = new DeleteElasticRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteElasticRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteElasticRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteElasticRuleResponse setBody(DeleteElasticRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteElasticRuleResponseBody getBody() {
        return this.body;
    }

}
