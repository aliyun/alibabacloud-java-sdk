// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListDeploymentTargetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDeploymentTargetsResponseBody body;

    public static ListDeploymentTargetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeploymentTargetsResponse self = new ListDeploymentTargetsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeploymentTargetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeploymentTargetsResponse setBody(ListDeploymentTargetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDeploymentTargetsResponseBody getBody() {
        return this.body;
    }

}
