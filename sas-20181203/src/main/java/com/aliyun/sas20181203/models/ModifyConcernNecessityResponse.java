// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyConcernNecessityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyConcernNecessityResponseBody body;

    public static ModifyConcernNecessityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConcernNecessityResponse self = new ModifyConcernNecessityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConcernNecessityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConcernNecessityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConcernNecessityResponse setBody(ModifyConcernNecessityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConcernNecessityResponseBody getBody() {
        return this.body;
    }

}
