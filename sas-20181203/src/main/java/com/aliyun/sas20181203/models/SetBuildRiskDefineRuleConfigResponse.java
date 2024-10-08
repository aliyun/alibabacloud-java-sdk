// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SetBuildRiskDefineRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetBuildRiskDefineRuleConfigResponseBody body;

    public static SetBuildRiskDefineRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetBuildRiskDefineRuleConfigResponse self = new SetBuildRiskDefineRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetBuildRiskDefineRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetBuildRiskDefineRuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetBuildRiskDefineRuleConfigResponse setBody(SetBuildRiskDefineRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetBuildRiskDefineRuleConfigResponseBody getBody() {
        return this.body;
    }

}
