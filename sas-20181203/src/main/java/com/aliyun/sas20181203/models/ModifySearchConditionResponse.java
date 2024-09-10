// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySearchConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySearchConditionResponseBody body;

    public static ModifySearchConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySearchConditionResponse self = new ModifySearchConditionResponse();
        return TeaModel.build(map, self);
    }

    public ModifySearchConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySearchConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySearchConditionResponse setBody(ModifySearchConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySearchConditionResponseBody getBody() {
        return this.body;
    }

}
