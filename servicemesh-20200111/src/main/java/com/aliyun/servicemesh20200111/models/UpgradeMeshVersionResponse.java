// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeMeshVersionResponseBody body;

    public static UpgradeMeshVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshVersionResponse self = new UpgradeMeshVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeMeshVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeMeshVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpgradeMeshVersionResponse setBody(UpgradeMeshVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeMeshVersionResponseBody getBody() {
        return this.body;
    }

}
