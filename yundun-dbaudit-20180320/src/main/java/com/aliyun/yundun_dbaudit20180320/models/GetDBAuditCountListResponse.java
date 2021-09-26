// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetDBAuditCountListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDBAuditCountListResponseBody body;

    public static GetDBAuditCountListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDBAuditCountListResponse self = new GetDBAuditCountListResponse();
        return TeaModel.build(map, self);
    }

    public GetDBAuditCountListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDBAuditCountListResponse setBody(GetDBAuditCountListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDBAuditCountListResponseBody getBody() {
        return this.body;
    }

}
