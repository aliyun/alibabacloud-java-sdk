// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetAegisContainerPluginRuleCriteriaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAegisContainerPluginRuleCriteriaResponseBody body;

    public static GetAegisContainerPluginRuleCriteriaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAegisContainerPluginRuleCriteriaResponse self = new GetAegisContainerPluginRuleCriteriaResponse();
        return TeaModel.build(map, self);
    }

    public GetAegisContainerPluginRuleCriteriaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAegisContainerPluginRuleCriteriaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAegisContainerPluginRuleCriteriaResponse setBody(GetAegisContainerPluginRuleCriteriaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAegisContainerPluginRuleCriteriaResponseBody getBody() {
        return this.body;
    }

}
