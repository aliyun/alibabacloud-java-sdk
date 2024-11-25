// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceDescriptionResponseBody body;

    public static ModifyRCInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceDescriptionResponse self = new ModifyRCInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceDescriptionResponse setBody(ModifyRCInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
