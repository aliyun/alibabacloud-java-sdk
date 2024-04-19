// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteWarningStrategyConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteWarningStrategyConfigResponseBody body;

    public static DeleteWarningStrategyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteWarningStrategyConfigResponse self = new DeleteWarningStrategyConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteWarningStrategyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteWarningStrategyConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteWarningStrategyConfigResponse setBody(DeleteWarningStrategyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteWarningStrategyConfigResponseBody getBody() {
        return this.body;
    }

}
