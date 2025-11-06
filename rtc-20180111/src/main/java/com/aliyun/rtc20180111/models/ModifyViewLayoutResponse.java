// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyViewLayoutResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyViewLayoutResponseBody body;

    public static ModifyViewLayoutResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyViewLayoutResponse self = new ModifyViewLayoutResponse();
        return TeaModel.build(map, self);
    }

    public ModifyViewLayoutResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyViewLayoutResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyViewLayoutResponse setBody(ModifyViewLayoutResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyViewLayoutResponseBody getBody() {
        return this.body;
    }

}
