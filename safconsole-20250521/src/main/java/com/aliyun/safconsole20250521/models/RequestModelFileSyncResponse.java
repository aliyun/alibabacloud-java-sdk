// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class RequestModelFileSyncResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestModelFileSyncResponseBody body;

    public static RequestModelFileSyncResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestModelFileSyncResponse self = new RequestModelFileSyncResponse();
        return TeaModel.build(map, self);
    }

    public RequestModelFileSyncResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestModelFileSyncResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestModelFileSyncResponse setBody(RequestModelFileSyncResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestModelFileSyncResponseBody getBody() {
        return this.body;
    }

}
