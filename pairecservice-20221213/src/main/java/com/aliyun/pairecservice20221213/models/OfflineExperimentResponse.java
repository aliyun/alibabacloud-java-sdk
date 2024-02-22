// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OfflineExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineExperimentResponseBody body;

    public static OfflineExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineExperimentResponse self = new OfflineExperimentResponse();
        return TeaModel.build(map, self);
    }

    public OfflineExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineExperimentResponse setBody(OfflineExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineExperimentResponseBody getBody() {
        return this.body;
    }

}
