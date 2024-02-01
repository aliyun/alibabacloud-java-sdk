// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySnatEntryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySnatEntryResponseBody body;

    public static ModifySnatEntryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySnatEntryResponse self = new ModifySnatEntryResponse();
        return TeaModel.build(map, self);
    }

    public ModifySnatEntryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySnatEntryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySnatEntryResponse setBody(ModifySnatEntryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySnatEntryResponseBody getBody() {
        return this.body;
    }

}
