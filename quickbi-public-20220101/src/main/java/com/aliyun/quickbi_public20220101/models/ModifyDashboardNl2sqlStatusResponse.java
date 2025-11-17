// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ModifyDashboardNl2sqlStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDashboardNl2sqlStatusResponseBody body;

    public static ModifyDashboardNl2sqlStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDashboardNl2sqlStatusResponse self = new ModifyDashboardNl2sqlStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDashboardNl2sqlStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDashboardNl2sqlStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDashboardNl2sqlStatusResponse setBody(ModifyDashboardNl2sqlStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDashboardNl2sqlStatusResponseBody getBody() {
        return this.body;
    }

}
