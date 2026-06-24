// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OfflineAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineAppInstanceResponseBody body;

    public static OfflineAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineAppInstanceResponse self = new OfflineAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public OfflineAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineAppInstanceResponse setBody(OfflineAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineAppInstanceResponseBody getBody() {
        return this.body;
    }

}
