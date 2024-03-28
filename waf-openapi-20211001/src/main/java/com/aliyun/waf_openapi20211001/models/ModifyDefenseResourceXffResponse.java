// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceXffResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseResourceXffResponseBody body;

    public static ModifyDefenseResourceXffResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceXffResponse self = new ModifyDefenseResourceXffResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceXffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseResourceXffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseResourceXffResponse setBody(ModifyDefenseResourceXffResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseResourceXffResponseBody getBody() {
        return this.body;
    }

}
