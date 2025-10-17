// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAccountDescriptionZonalResponseBody body;

    public static ModifyAccountDescriptionZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionZonalResponse self = new ModifyAccountDescriptionZonalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAccountDescriptionZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAccountDescriptionZonalResponse setBody(ModifyAccountDescriptionZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAccountDescriptionZonalResponseBody getBody() {
        return this.body;
    }

}
