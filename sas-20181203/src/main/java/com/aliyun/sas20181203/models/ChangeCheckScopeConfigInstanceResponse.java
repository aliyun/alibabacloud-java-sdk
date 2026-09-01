// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeCheckScopeConfigInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeCheckScopeConfigInstanceResponseBody body;

    public static ChangeCheckScopeConfigInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeCheckScopeConfigInstanceResponse self = new ChangeCheckScopeConfigInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ChangeCheckScopeConfigInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeCheckScopeConfigInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeCheckScopeConfigInstanceResponse setBody(ChangeCheckScopeConfigInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeCheckScopeConfigInstanceResponseBody getBody() {
        return this.body;
    }

}
