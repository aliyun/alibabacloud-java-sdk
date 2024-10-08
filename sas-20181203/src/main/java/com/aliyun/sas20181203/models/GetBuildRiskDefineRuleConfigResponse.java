// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBuildRiskDefineRuleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBuildRiskDefineRuleConfigResponseBody body;

    public static GetBuildRiskDefineRuleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBuildRiskDefineRuleConfigResponse self = new GetBuildRiskDefineRuleConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBuildRiskDefineRuleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBuildRiskDefineRuleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBuildRiskDefineRuleConfigResponse setBody(GetBuildRiskDefineRuleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBuildRiskDefineRuleConfigResponseBody getBody() {
        return this.body;
    }

}
