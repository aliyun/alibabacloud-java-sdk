// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyAppLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAppLayoutResponseBody body;

    public static ModifyAppLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppLayoutResponse self = new ModifyAppLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAppLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAppLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAppLayoutResponse setBody(ModifyAppLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAppLayoutResponseBody getBody() {
        return this.body;
    }

}
