// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateABTestGroupResponseBody body;

    public static UpdateABTestGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestGroupResponse self = new UpdateABTestGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABTestGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABTestGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateABTestGroupResponse setBody(UpdateABTestGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABTestGroupResponseBody getBody() {
        return this.body;
    }

}
