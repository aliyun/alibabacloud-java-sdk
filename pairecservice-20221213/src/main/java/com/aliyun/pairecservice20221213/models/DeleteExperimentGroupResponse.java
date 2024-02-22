// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentGroupResponseBody body;

    public static DeleteExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentGroupResponse self = new DeleteExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentGroupResponse setBody(DeleteExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
