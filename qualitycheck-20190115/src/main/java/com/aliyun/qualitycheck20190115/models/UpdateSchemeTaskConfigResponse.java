// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSchemeTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSchemeTaskConfigResponseBody body;

    public static UpdateSchemeTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSchemeTaskConfigResponse self = new UpdateSchemeTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSchemeTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSchemeTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSchemeTaskConfigResponse setBody(UpdateSchemeTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

}
