// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateSwimLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSwimLaneGroupResponseBody body;

    public static UpdateSwimLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSwimLaneGroupResponse self = new UpdateSwimLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSwimLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSwimLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSwimLaneGroupResponse setBody(UpdateSwimLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSwimLaneGroupResponseBody getBody() {
        return this.body;
    }

}
