// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyElasticRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyElasticRuleResponseBody body;

    public static ModifyElasticRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticRuleResponse self = new ModifyElasticRuleResponse();
        return TeaModel.build(map, self);
    }

    public ModifyElasticRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyElasticRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyElasticRuleResponse setBody(ModifyElasticRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyElasticRuleResponseBody getBody() {
        return this.body;
    }

}
