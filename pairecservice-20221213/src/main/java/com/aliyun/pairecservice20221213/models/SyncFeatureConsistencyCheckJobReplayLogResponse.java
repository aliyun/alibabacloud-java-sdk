// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class SyncFeatureConsistencyCheckJobReplayLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncFeatureConsistencyCheckJobReplayLogResponseBody body;

    public static SyncFeatureConsistencyCheckJobReplayLogResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncFeatureConsistencyCheckJobReplayLogResponse self = new SyncFeatureConsistencyCheckJobReplayLogResponse();
        return TeaModel.build(map, self);
    }

    public SyncFeatureConsistencyCheckJobReplayLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncFeatureConsistencyCheckJobReplayLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncFeatureConsistencyCheckJobReplayLogResponse setBody(SyncFeatureConsistencyCheckJobReplayLogResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncFeatureConsistencyCheckJobReplayLogResponseBody getBody() {
        return this.body;
    }

}
