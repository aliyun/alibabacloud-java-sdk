// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CheckPolarFsQuotaConsistencyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckPolarFsQuotaConsistencyResponseBody body;

    public static CheckPolarFsQuotaConsistencyResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckPolarFsQuotaConsistencyResponse self = new CheckPolarFsQuotaConsistencyResponse();
        return TeaModel.build(map, self);
    }

    public CheckPolarFsQuotaConsistencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckPolarFsQuotaConsistencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckPolarFsQuotaConsistencyResponse setBody(CheckPolarFsQuotaConsistencyResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckPolarFsQuotaConsistencyResponseBody getBody() {
        return this.body;
    }

}
