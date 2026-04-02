// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class UpdateTempFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTempFileResponseBody body;

    public static UpdateTempFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTempFileResponse self = new UpdateTempFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTempFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTempFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTempFileResponse setBody(UpdateTempFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTempFileResponseBody getBody() {
        return this.body;
    }

}
