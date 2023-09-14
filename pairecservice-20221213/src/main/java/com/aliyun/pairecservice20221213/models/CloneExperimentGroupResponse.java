// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloneExperimentGroupResponseBody body;

    public static CloneExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentGroupResponse self = new CloneExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CloneExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneExperimentGroupResponse setBody(CloneExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
