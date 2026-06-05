// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class UpdateAppFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppFileResponseBody body;

    public static UpdateAppFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppFileResponse self = new UpdateAppFileResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppFileResponse setBody(UpdateAppFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppFileResponseBody getBody() {
        return this.body;
    }

}
