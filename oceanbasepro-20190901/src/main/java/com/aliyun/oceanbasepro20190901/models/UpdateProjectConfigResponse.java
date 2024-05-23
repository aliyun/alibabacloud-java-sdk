// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateProjectConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProjectConfigResponseBody body;

    public static UpdateProjectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectConfigResponse self = new UpdateProjectConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProjectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProjectConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProjectConfigResponse setBody(UpdateProjectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProjectConfigResponseBody getBody() {
        return this.body;
    }

}
