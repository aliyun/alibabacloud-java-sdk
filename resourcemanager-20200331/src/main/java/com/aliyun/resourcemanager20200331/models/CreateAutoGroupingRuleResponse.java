// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CreateAutoGroupingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutoGroupingRuleResponseBody body;

    public static CreateAutoGroupingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoGroupingRuleResponse self = new CreateAutoGroupingRuleResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutoGroupingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutoGroupingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutoGroupingRuleResponse setBody(CreateAutoGroupingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutoGroupingRuleResponseBody getBody() {
        return this.body;
    }

}
