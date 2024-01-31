// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAccessKeyLeakDealResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccessKeyLeakDealResponseBody body;

    public static ModifyAccessKeyLeakDealResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccessKeyLeakDealResponse self = new ModifyAccessKeyLeakDealResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccessKeyLeakDealResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccessKeyLeakDealResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccessKeyLeakDealResponse setBody(ModifyAccessKeyLeakDealResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccessKeyLeakDealResponseBody getBody() {
        return this.body;
    }

}
