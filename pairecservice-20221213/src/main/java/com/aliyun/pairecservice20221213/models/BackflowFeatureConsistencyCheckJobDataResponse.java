// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class BackflowFeatureConsistencyCheckJobDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BackflowFeatureConsistencyCheckJobDataResponseBody body;

    public static BackflowFeatureConsistencyCheckJobDataResponse build(java.util.Map<String, ?> map) throws Exception {
        BackflowFeatureConsistencyCheckJobDataResponse self = new BackflowFeatureConsistencyCheckJobDataResponse();
        return TeaModel.build(map, self);
    }

    public BackflowFeatureConsistencyCheckJobDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BackflowFeatureConsistencyCheckJobDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BackflowFeatureConsistencyCheckJobDataResponse setBody(BackflowFeatureConsistencyCheckJobDataResponseBody body) {
        this.body = body;
        return this;
    }
    public BackflowFeatureConsistencyCheckJobDataResponseBody getBody() {
        return this.body;
    }

}
