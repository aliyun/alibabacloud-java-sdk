// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LogtailConfig body;

    public static GetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponse self = new GetConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigResponse setBody(LogtailConfig body) {
        this.body = body;
        return this;
    }
    public LogtailConfig getBody() {
        return this.body;
    }

}
