// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalInstallScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLocalInstallScriptResponseBody body;

    public static GetLocalInstallScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLocalInstallScriptResponse self = new GetLocalInstallScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetLocalInstallScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLocalInstallScriptResponse setBody(GetLocalInstallScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLocalInstallScriptResponseBody getBody() {
        return this.body;
    }

}
