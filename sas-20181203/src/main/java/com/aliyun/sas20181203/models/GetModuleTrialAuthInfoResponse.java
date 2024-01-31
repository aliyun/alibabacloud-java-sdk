// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetModuleTrialAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetModuleTrialAuthInfoResponseBody body;

    public static GetModuleTrialAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModuleTrialAuthInfoResponse self = new GetModuleTrialAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetModuleTrialAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModuleTrialAuthInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModuleTrialAuthInfoResponse setBody(GetModuleTrialAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModuleTrialAuthInfoResponseBody getBody() {
        return this.body;
    }

}
