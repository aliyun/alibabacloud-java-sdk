// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class DeleteRobotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRobotResponseBody body;

    public static DeleteRobotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRobotResponse self = new DeleteRobotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRobotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRobotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRobotResponse setBody(DeleteRobotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRobotResponseBody getBody() {
        return this.body;
    }

}
