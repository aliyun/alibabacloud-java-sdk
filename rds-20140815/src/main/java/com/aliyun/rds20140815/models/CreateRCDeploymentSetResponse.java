// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateRCDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRCDeploymentSetResponseBody body;

    public static CreateRCDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRCDeploymentSetResponse self = new CreateRCDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateRCDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRCDeploymentSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRCDeploymentSetResponse setBody(CreateRCDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRCDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
