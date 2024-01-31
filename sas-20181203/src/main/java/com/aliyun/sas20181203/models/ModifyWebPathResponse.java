// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebPathResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebPathResponseBody body;

    public static ModifyWebPathResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebPathResponse self = new ModifyWebPathResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebPathResponse setBody(ModifyWebPathResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebPathResponseBody getBody() {
        return this.body;
    }

}
