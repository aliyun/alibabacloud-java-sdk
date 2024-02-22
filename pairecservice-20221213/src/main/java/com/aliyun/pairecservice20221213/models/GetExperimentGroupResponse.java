// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExperimentGroupResponseBody body;

    public static GetExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentGroupResponse self = new GetExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExperimentGroupResponse setBody(GetExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
