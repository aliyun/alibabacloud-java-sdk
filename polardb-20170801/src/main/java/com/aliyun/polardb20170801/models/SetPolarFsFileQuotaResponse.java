// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SetPolarFsFileQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolarFsFileQuotaResponseBody body;

    public static SetPolarFsFileQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolarFsFileQuotaResponse self = new SetPolarFsFileQuotaResponse();
        return TeaModel.build(map, self);
    }

    public SetPolarFsFileQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolarFsFileQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolarFsFileQuotaResponse setBody(SetPolarFsFileQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolarFsFileQuotaResponseBody getBody() {
        return this.body;
    }

}
