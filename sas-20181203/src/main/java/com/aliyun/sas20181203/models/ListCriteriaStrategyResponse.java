// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCriteriaStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCriteriaStrategyResponseBody body;

    public static ListCriteriaStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCriteriaStrategyResponse self = new ListCriteriaStrategyResponse();
        return TeaModel.build(map, self);
    }

    public ListCriteriaStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCriteriaStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCriteriaStrategyResponse setBody(ListCriteriaStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCriteriaStrategyResponseBody getBody() {
        return this.body;
    }

}
