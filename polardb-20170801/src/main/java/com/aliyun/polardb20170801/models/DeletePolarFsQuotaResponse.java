// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarFsQuotaResponseBody body;

    public static DeletePolarFsQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsQuotaResponse self = new DeletePolarFsQuotaResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarFsQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarFsQuotaResponse setBody(DeletePolarFsQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarFsQuotaResponseBody getBody() {
        return this.body;
    }

}
