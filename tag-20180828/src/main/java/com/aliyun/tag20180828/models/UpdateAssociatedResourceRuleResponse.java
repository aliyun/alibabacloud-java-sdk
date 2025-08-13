// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class UpdateAssociatedResourceRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAssociatedResourceRuleResponseBody body;

    public static UpdateAssociatedResourceRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAssociatedResourceRuleResponse self = new UpdateAssociatedResourceRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAssociatedResourceRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAssociatedResourceRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAssociatedResourceRuleResponse setBody(UpdateAssociatedResourceRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAssociatedResourceRuleResponseBody getBody() {
        return this.body;
    }

}
