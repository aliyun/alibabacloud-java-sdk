// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClientUserDefineRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClientUserDefineRulesResponseBody body;

    public static ListClientUserDefineRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClientUserDefineRulesResponse self = new ListClientUserDefineRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListClientUserDefineRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClientUserDefineRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClientUserDefineRulesResponse setBody(ListClientUserDefineRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClientUserDefineRulesResponseBody getBody() {
        return this.body;
    }

}
