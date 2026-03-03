// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateSupabaseForAdminResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateSupabaseForAdminResponseBody body;

    public static OperateSupabaseForAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSupabaseForAdminResponse self = new OperateSupabaseForAdminResponse();
        return TeaModel.build(map, self);
    }

    public OperateSupabaseForAdminResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSupabaseForAdminResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateSupabaseForAdminResponse setBody(OperateSupabaseForAdminResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSupabaseForAdminResponseBody getBody() {
        return this.body;
    }

}
