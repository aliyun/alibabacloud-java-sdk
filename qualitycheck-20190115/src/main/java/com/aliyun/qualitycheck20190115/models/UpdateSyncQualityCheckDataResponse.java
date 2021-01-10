// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateSyncQualityCheckDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSyncQualityCheckDataResponseBody body;

    public static UpdateSyncQualityCheckDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSyncQualityCheckDataResponse self = new UpdateSyncQualityCheckDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSyncQualityCheckDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSyncQualityCheckDataResponse setBody(UpdateSyncQualityCheckDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSyncQualityCheckDataResponseBody getBody() {
        return this.body;
    }

}
