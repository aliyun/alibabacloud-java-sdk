// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRuleTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientUserDefineRuleTypesResponseBody body;

    public static ListClientUserDefineRuleTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientUserDefineRuleTypesResponse self = new ListClientUserDefineRuleTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListClientUserDefineRuleTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientUserDefineRuleTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientUserDefineRuleTypesResponse setBody(ListClientUserDefineRuleTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientUserDefineRuleTypesResponseBody getBody() {
        return this.body;
    }

}
