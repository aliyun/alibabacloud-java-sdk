// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateRuleToSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRuleToSchemeResponseBody body;

    public static UpdateRuleToSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRuleToSchemeResponse self = new UpdateRuleToSchemeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRuleToSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRuleToSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRuleToSchemeResponse setBody(UpdateRuleToSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRuleToSchemeResponseBody getBody() {
        return this.body;
    }

}
