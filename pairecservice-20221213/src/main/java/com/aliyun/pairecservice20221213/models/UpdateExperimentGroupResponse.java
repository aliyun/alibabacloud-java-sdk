// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentGroupResponseBody body;

    public static UpdateExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentGroupResponse self = new UpdateExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentGroupResponse setBody(UpdateExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
