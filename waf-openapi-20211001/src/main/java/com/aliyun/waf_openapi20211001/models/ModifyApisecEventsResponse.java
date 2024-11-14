// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyApisecEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApisecEventsResponseBody body;

    public static ModifyApisecEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApisecEventsResponse self = new ModifyApisecEventsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApisecEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApisecEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApisecEventsResponse setBody(ModifyApisecEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApisecEventsResponseBody getBody() {
        return this.body;
    }

}
