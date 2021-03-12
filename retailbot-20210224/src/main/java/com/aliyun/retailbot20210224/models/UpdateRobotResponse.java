// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class UpdateRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRobotResponseBody body;

    public static UpdateRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRobotResponse self = new UpdateRobotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRobotResponse setBody(UpdateRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRobotResponseBody getBody() {
        return this.body;
    }

}
