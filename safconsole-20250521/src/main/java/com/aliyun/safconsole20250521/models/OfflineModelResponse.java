// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class OfflineModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineModelResponseBody body;

    public static OfflineModelResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineModelResponse self = new OfflineModelResponse();
        return TeaModel.build(map, self);
    }

    public OfflineModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineModelResponse setBody(OfflineModelResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineModelResponseBody getBody() {
        return this.body;
    }

}
