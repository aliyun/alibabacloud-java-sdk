// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDataLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDataLimitResponseBody body;

    public static ModifyDataLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataLimitResponse self = new ModifyDataLimitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDataLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDataLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDataLimitResponse setBody(ModifyDataLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDataLimitResponseBody getBody() {
        return this.body;
    }

}
