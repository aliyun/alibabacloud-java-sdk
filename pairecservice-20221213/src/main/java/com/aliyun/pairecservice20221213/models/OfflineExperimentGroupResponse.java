// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineExperimentGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineExperimentGroupResponseBody body;

    public static OfflineExperimentGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineExperimentGroupResponse self = new OfflineExperimentGroupResponse();
        return TeaModel.build(map, self);
    }

    public OfflineExperimentGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineExperimentGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineExperimentGroupResponse setBody(OfflineExperimentGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineExperimentGroupResponseBody getBody() {
        return this.body;
    }

}
