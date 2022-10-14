// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class CreateSwimLaneGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSwimLaneGroupResponseBody body;

    public static CreateSwimLaneGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSwimLaneGroupResponse self = new CreateSwimLaneGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateSwimLaneGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSwimLaneGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSwimLaneGroupResponse setBody(CreateSwimLaneGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSwimLaneGroupResponseBody getBody() {
        return this.body;
    }

}
