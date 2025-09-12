// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class SaveCrowdDatasetAndBindingDatasetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveCrowdDatasetAndBindingDatasetResponseBody body;

    public static SaveCrowdDatasetAndBindingDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCrowdDatasetAndBindingDatasetResponse self = new SaveCrowdDatasetAndBindingDatasetResponse();
        return TeaModel.build(map, self);
    }

    public SaveCrowdDatasetAndBindingDatasetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCrowdDatasetAndBindingDatasetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveCrowdDatasetAndBindingDatasetResponse setBody(SaveCrowdDatasetAndBindingDatasetResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCrowdDatasetAndBindingDatasetResponseBody getBody() {
        return this.body;
    }

}
