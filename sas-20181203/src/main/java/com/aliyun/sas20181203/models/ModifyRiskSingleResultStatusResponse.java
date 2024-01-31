// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyRiskSingleResultStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRiskSingleResultStatusResponseBody body;

    public static ModifyRiskSingleResultStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRiskSingleResultStatusResponse self = new ModifyRiskSingleResultStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRiskSingleResultStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRiskSingleResultStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRiskSingleResultStatusResponse setBody(ModifyRiskSingleResultStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRiskSingleResultStatusResponseBody getBody() {
        return this.body;
    }

}
