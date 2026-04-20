// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppRagConfigResponseBody body;

    public static UpdateMmAppRagConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagConfigResponse self = new UpdateMmAppRagConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppRagConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppRagConfigResponse setBody(UpdateMmAppRagConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppRagConfigResponseBody getBody() {
        return this.body;
    }

}
