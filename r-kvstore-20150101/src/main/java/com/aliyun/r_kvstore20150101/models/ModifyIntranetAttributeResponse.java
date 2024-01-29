// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyIntranetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIntranetAttributeResponseBody body;

    public static ModifyIntranetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIntranetAttributeResponse self = new ModifyIntranetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIntranetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIntranetAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIntranetAttributeResponse setBody(ModifyIntranetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIntranetAttributeResponseBody getBody() {
        return this.body;
    }

}
