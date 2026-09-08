// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingEncryptionAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataMaskingEncryptionAlgorithmResponseBody body;

    public static UpdateDataMaskingEncryptionAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataMaskingEncryptionAlgorithmResponse self = new UpdateDataMaskingEncryptionAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataMaskingEncryptionAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataMaskingEncryptionAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataMaskingEncryptionAlgorithmResponse setBody(UpdateDataMaskingEncryptionAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataMaskingEncryptionAlgorithmResponseBody getBody() {
        return this.body;
    }

}
