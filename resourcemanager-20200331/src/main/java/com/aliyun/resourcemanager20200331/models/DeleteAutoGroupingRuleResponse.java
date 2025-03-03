// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteAutoGroupingRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAutoGroupingRuleResponseBody body;

    public static DeleteAutoGroupingRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoGroupingRuleResponse self = new DeleteAutoGroupingRuleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAutoGroupingRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAutoGroupingRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAutoGroupingRuleResponse setBody(DeleteAutoGroupingRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAutoGroupingRuleResponseBody getBody() {
        return this.body;
    }

}
