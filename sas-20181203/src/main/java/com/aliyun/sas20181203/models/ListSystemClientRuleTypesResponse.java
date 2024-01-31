// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListSystemClientRuleTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSystemClientRuleTypesResponseBody body;

    public static ListSystemClientRuleTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSystemClientRuleTypesResponse self = new ListSystemClientRuleTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListSystemClientRuleTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSystemClientRuleTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSystemClientRuleTypesResponse setBody(ListSystemClientRuleTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSystemClientRuleTypesResponseBody getBody() {
        return this.body;
    }

}
