// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ContinueDeployApplicationGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ContinueDeployApplicationGroupResponseBody body;

    public static ContinueDeployApplicationGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueDeployApplicationGroupResponse self = new ContinueDeployApplicationGroupResponse();
        return TeaModel.build(map, self);
    }

    public ContinueDeployApplicationGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueDeployApplicationGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinueDeployApplicationGroupResponse setBody(ContinueDeployApplicationGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueDeployApplicationGroupResponseBody getBody() {
        return this.body;
    }

}
