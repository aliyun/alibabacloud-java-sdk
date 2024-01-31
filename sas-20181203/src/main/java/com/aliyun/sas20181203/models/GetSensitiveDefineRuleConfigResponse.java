// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSensitiveDefineRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSensitiveDefineRuleConfigResponseBody body;

    public static GetSensitiveDefineRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDefineRuleConfigResponse self = new GetSensitiveDefineRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDefineRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSensitiveDefineRuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSensitiveDefineRuleConfigResponse setBody(GetSensitiveDefineRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSensitiveDefineRuleConfigResponseBody getBody() {
        return this.body;
    }

}
