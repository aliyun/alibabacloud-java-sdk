// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UpdateAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuditResponseBody body;

    public static UpdateAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditResponse self = new UpdateAuditResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuditResponse setBody(UpdateAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuditResponseBody getBody() {
        return this.body;
    }

}
