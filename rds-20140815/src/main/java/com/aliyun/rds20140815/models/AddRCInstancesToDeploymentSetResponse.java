// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AddRCInstancesToDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddRCInstancesToDeploymentSetResponseBody body;

    public static AddRCInstancesToDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRCInstancesToDeploymentSetResponse self = new AddRCInstancesToDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public AddRCInstancesToDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRCInstancesToDeploymentSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRCInstancesToDeploymentSetResponse setBody(AddRCInstancesToDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRCInstancesToDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
