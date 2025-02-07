// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class ModifyInstancePropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstancePropertiesResponseBody body;

    public static ModifyInstancePropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstancePropertiesResponse self = new ModifyInstancePropertiesResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstancePropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstancePropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstancePropertiesResponse setBody(ModifyInstancePropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstancePropertiesResponseBody getBody() {
        return this.body;
    }

}
