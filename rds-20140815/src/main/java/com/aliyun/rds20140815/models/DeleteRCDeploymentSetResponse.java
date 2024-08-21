// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCDeploymentSetResponseBody body;

    public static DeleteRCDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCDeploymentSetResponse self = new DeleteRCDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCDeploymentSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCDeploymentSetResponse setBody(DeleteRCDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
