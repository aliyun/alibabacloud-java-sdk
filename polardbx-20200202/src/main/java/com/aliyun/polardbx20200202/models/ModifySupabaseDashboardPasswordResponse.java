// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySupabaseDashboardPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseDashboardPasswordResponseBody body;

    public static ModifySupabaseDashboardPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseDashboardPasswordResponse self = new ModifySupabaseDashboardPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseDashboardPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseDashboardPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseDashboardPasswordResponse setBody(ModifySupabaseDashboardPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseDashboardPasswordResponseBody getBody() {
        return this.body;
    }

}
