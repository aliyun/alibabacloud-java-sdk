// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnlineExperimentGroupResponseBody body;

    public static OnlineExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentGroupResponse self = new OnlineExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineExperimentGroupResponse setBody(OnlineExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
