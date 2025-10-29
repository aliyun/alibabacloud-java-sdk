// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPolarFsQuotaResponseBody body;

    public static AddPolarFsQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsQuotaResponse self = new AddPolarFsQuotaResponse();
        return TeaModel.build(map, self);
    }

    public AddPolarFsQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPolarFsQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPolarFsQuotaResponse setBody(AddPolarFsQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPolarFsQuotaResponseBody getBody() {
        return this.body;
    }

}
