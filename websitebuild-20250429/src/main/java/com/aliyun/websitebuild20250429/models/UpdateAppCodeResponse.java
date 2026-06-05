// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppCodeResponseBody body;

    public static UpdateAppCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppCodeResponse self = new UpdateAppCodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppCodeResponse setBody(UpdateAppCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppCodeResponseBody getBody() {
        return this.body;
    }

}
