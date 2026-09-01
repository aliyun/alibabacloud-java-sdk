// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCheckScopeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCheckScopeConfigResponseBody body;

    public static UpdateCheckScopeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckScopeConfigResponse self = new UpdateCheckScopeConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCheckScopeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCheckScopeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCheckScopeConfigResponse setBody(UpdateCheckScopeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCheckScopeConfigResponseBody getBody() {
        return this.body;
    }

}
