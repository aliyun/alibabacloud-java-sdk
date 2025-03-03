// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateAutoGroupingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoGroupingRuleResponseBody body;

    public static UpdateAutoGroupingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoGroupingRuleResponse self = new UpdateAutoGroupingRuleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoGroupingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoGroupingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoGroupingRuleResponse setBody(UpdateAutoGroupingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoGroupingRuleResponseBody getBody() {
        return this.body;
    }

}
