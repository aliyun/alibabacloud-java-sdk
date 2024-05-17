// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class UpdateAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAppGroupResponseBody body;

    public static UpdateAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppGroupResponse self = new UpdateAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAppGroupResponse setBody(UpdateAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAppGroupResponseBody getBody() {
        return this.body;
    }

}
