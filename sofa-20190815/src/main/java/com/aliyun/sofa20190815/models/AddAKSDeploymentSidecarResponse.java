// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddAKSDeploymentSidecarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAKSDeploymentSidecarResponseBody body;

    public static AddAKSDeploymentSidecarResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAKSDeploymentSidecarResponse self = new AddAKSDeploymentSidecarResponse();
        return TeaModel.build(map, self);
    }

    public AddAKSDeploymentSidecarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAKSDeploymentSidecarResponse setBody(AddAKSDeploymentSidecarResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAKSDeploymentSidecarResponseBody getBody() {
        return this.body;
    }

}
