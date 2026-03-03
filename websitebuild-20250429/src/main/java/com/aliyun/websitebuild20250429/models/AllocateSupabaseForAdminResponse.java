// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class AllocateSupabaseForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AllocateSupabaseForAdminResponseBody body;

    public static AllocateSupabaseForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        AllocateSupabaseForAdminResponse self = new AllocateSupabaseForAdminResponse();
        return TeaModel.build(map, self);
    }

    public AllocateSupabaseForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AllocateSupabaseForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AllocateSupabaseForAdminResponse setBody(AllocateSupabaseForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public AllocateSupabaseForAdminResponseBody getBody() {
        return this.body;
    }

}
