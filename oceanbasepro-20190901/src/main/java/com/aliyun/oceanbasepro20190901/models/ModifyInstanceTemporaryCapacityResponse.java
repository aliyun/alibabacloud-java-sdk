// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyInstanceTemporaryCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceTemporaryCapacityResponseBody body;

    public static ModifyInstanceTemporaryCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceTemporaryCapacityResponse self = new ModifyInstanceTemporaryCapacityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceTemporaryCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceTemporaryCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceTemporaryCapacityResponse setBody(ModifyInstanceTemporaryCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceTemporaryCapacityResponseBody getBody() {
        return this.body;
    }

}
