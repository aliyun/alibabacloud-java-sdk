// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppInstanceResponseBody body;

    public static UpdateAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppInstanceResponse self = new UpdateAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppInstanceResponse setBody(UpdateAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppInstanceResponseBody getBody() {
        return this.body;
    }

}
