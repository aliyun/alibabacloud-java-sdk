// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetSensitiveDefineRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetSensitiveDefineRuleConfigResponseBody body;

    public static SetSensitiveDefineRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetSensitiveDefineRuleConfigResponse self = new SetSensitiveDefineRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetSensitiveDefineRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetSensitiveDefineRuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetSensitiveDefineRuleConfigResponse setBody(SetSensitiveDefineRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetSensitiveDefineRuleConfigResponseBody getBody() {
        return this.body;
    }

}
