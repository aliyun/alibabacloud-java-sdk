// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelOutputContentSyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelOutputContentSyncDetectResponseBody body;

    public static ModelOutputContentSyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelOutputContentSyncDetectResponse self = new ModelOutputContentSyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ModelOutputContentSyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelOutputContentSyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelOutputContentSyncDetectResponse setBody(ModelOutputContentSyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelOutputContentSyncDetectResponseBody getBody() {
        return this.body;
    }

}
