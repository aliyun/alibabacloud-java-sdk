// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class RemoveRCInstancesFromDeploymentSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveRCInstancesFromDeploymentSetResponseBody body;

    public static RemoveRCInstancesFromDeploymentSetResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveRCInstancesFromDeploymentSetResponse self = new RemoveRCInstancesFromDeploymentSetResponse();
        return TeaModel.build(map, self);
    }

    public RemoveRCInstancesFromDeploymentSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveRCInstancesFromDeploymentSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveRCInstancesFromDeploymentSetResponse setBody(RemoveRCInstancesFromDeploymentSetResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveRCInstancesFromDeploymentSetResponseBody getBody() {
        return this.body;
    }

}
