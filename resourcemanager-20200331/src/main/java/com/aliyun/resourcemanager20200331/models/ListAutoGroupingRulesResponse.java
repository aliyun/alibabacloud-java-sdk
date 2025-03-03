// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListAutoGroupingRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAutoGroupingRulesResponseBody body;

    public static ListAutoGroupingRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAutoGroupingRulesResponse self = new ListAutoGroupingRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListAutoGroupingRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAutoGroupingRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAutoGroupingRulesResponse setBody(ListAutoGroupingRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAutoGroupingRulesResponseBody getBody() {
        return this.body;
    }

}
