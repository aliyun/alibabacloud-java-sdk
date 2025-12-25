// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class SaveModelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveModelConfigResponseBody body;

    public static SaveModelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveModelConfigResponse self = new SaveModelConfigResponse();
        return TeaModel.build(map, self);
    }

    public SaveModelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveModelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveModelConfigResponse setBody(SaveModelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveModelConfigResponseBody getBody() {
        return this.body;
    }

}
