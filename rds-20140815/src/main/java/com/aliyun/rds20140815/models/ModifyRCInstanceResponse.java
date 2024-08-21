// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceResponseBody body;

    public static ModifyRCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceResponse self = new ModifyRCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceResponse setBody(ModifyRCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceResponseBody getBody() {
        return this.body;
    }

}
