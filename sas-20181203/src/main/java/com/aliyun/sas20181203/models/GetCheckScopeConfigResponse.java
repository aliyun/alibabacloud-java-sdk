// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckScopeConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckScopeConfigResponseBody body;

    public static GetCheckScopeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckScopeConfigResponse self = new GetCheckScopeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckScopeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckScopeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckScopeConfigResponse setBody(GetCheckScopeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckScopeConfigResponseBody getBody() {
        return this.body;
    }

}
