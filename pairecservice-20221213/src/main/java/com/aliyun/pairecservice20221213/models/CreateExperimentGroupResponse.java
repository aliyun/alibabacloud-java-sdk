// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentGroupResponseBody body;

    public static CreateExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentGroupResponse self = new CreateExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentGroupResponse setBody(CreateExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
