// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSwimLaneResponseBody body;

    public static UpdateSwimLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneResponse self = new UpdateSwimLaneResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSwimLaneResponse setBody(UpdateSwimLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimLaneResponseBody getBody() {
        return this.body;
    }

}
