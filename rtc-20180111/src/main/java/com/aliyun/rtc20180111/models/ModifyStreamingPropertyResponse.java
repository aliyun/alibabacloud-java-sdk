// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class ModifyStreamingPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyStreamingPropertyResponseBody body;

    public static ModifyStreamingPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyStreamingPropertyResponse self = new ModifyStreamingPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyStreamingPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyStreamingPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyStreamingPropertyResponse setBody(ModifyStreamingPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyStreamingPropertyResponseBody getBody() {
        return this.body;
    }

}
