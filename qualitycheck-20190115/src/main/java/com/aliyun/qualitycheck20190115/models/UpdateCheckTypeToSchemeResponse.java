// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateCheckTypeToSchemeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCheckTypeToSchemeResponseBody body;

    public static UpdateCheckTypeToSchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckTypeToSchemeResponse self = new UpdateCheckTypeToSchemeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCheckTypeToSchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCheckTypeToSchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCheckTypeToSchemeResponse setBody(UpdateCheckTypeToSchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCheckTypeToSchemeResponseBody getBody() {
        return this.body;
    }

}
