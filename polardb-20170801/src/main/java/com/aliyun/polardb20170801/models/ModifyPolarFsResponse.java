// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolarFsResponseBody body;

    public static ModifyPolarFsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsResponse self = new ModifyPolarFsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolarFsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolarFsResponse setBody(ModifyPolarFsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolarFsResponseBody getBody() {
        return this.body;
    }

}
