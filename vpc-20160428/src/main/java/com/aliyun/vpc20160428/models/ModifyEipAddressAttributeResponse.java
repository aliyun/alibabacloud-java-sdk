// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEipAddressAttributeResponseBody body;

    public static ModifyEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipAddressAttributeResponse self = new ModifyEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEipAddressAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEipAddressAttributeResponse setBody(ModifyEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}
