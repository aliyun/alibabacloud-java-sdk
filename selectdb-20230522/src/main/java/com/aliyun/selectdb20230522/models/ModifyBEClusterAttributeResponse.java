// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyBEClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBEClusterAttributeResponseBody body;

    public static ModifyBEClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBEClusterAttributeResponse self = new ModifyBEClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBEClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBEClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBEClusterAttributeResponse setBody(ModifyBEClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBEClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
