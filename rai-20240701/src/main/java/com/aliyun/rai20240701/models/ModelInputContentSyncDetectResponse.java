// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ModelInputContentSyncDetectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelInputContentSyncDetectResponseBody body;

    public static ModelInputContentSyncDetectResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelInputContentSyncDetectResponse self = new ModelInputContentSyncDetectResponse();
        return TeaModel.build(map, self);
    }

    public ModelInputContentSyncDetectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelInputContentSyncDetectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelInputContentSyncDetectResponse setBody(ModelInputContentSyncDetectResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelInputContentSyncDetectResponseBody getBody() {
        return this.body;
    }

}
