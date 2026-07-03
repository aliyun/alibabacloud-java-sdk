// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifySupabaseSecurityIPListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySupabaseSecurityIPListResponseBody body;

    public static ModifySupabaseSecurityIPListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseSecurityIPListResponse self = new ModifySupabaseSecurityIPListResponse();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseSecurityIPListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySupabaseSecurityIPListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySupabaseSecurityIPListResponse setBody(ModifySupabaseSecurityIPListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySupabaseSecurityIPListResponseBody getBody() {
        return this.body;
    }

}
