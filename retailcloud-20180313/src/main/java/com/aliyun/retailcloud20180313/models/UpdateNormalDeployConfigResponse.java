// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class UpdateNormalDeployConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNormalDeployConfigResponseBody body;

    public static UpdateNormalDeployConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNormalDeployConfigResponse self = new UpdateNormalDeployConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNormalDeployConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNormalDeployConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNormalDeployConfigResponse setBody(UpdateNormalDeployConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNormalDeployConfigResponseBody getBody() {
        return this.body;
    }

}
