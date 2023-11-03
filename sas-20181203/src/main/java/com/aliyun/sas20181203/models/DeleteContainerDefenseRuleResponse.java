// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteContainerDefenseRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContainerDefenseRuleResponseBody body;

    public static DeleteContainerDefenseRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContainerDefenseRuleResponse self = new DeleteContainerDefenseRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContainerDefenseRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContainerDefenseRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContainerDefenseRuleResponse setBody(DeleteContainerDefenseRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContainerDefenseRuleResponseBody getBody() {
        return this.body;
    }

}
