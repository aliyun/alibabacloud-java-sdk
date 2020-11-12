// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class DeleteDeploymentRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    public static DeleteDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeploymentRequest self = new DeleteDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeploymentRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
