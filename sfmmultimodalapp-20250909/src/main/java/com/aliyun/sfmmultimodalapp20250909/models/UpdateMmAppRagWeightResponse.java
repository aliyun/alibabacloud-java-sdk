// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class UpdateMmAppRagWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMmAppRagWeightResponseBody body;

    public static UpdateMmAppRagWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMmAppRagWeightResponse self = new UpdateMmAppRagWeightResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMmAppRagWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMmAppRagWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMmAppRagWeightResponse setBody(UpdateMmAppRagWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMmAppRagWeightResponseBody getBody() {
        return this.body;
    }

}
