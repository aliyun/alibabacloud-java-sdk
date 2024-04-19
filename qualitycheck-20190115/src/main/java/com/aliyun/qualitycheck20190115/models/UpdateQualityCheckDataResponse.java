// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQualityCheckDataResponseBody body;

    public static UpdateQualityCheckDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckDataResponse self = new UpdateQualityCheckDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQualityCheckDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQualityCheckDataResponse setBody(UpdateQualityCheckDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQualityCheckDataResponseBody getBody() {
        return this.body;
    }

}
