// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppRagResponseBody body;

    public static UpdateMmAppRagResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagResponse self = new UpdateMmAppRagResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppRagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppRagResponse setBody(UpdateMmAppRagResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppRagResponseBody getBody() {
        return this.body;
    }

}
