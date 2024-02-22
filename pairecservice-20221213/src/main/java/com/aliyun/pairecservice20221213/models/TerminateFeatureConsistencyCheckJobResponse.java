// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class TerminateFeatureConsistencyCheckJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateFeatureConsistencyCheckJobResponseBody body;

    public static TerminateFeatureConsistencyCheckJobResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateFeatureConsistencyCheckJobResponse self = new TerminateFeatureConsistencyCheckJobResponse();
        return TeaModel.build(map, self);
    }

    public TerminateFeatureConsistencyCheckJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateFeatureConsistencyCheckJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateFeatureConsistencyCheckJobResponse setBody(TerminateFeatureConsistencyCheckJobResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateFeatureConsistencyCheckJobResponseBody getBody() {
        return this.body;
    }

}
