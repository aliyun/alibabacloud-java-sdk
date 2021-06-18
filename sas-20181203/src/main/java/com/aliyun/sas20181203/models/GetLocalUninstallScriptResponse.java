// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetLocalUninstallScriptResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLocalUninstallScriptResponseBody body;

    public static GetLocalUninstallScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLocalUninstallScriptResponse self = new GetLocalUninstallScriptResponse();
        return TeaModel.build(map, self);
    }

    public GetLocalUninstallScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLocalUninstallScriptResponse setBody(GetLocalUninstallScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLocalUninstallScriptResponseBody getBody() {
        return this.body;
    }

}
