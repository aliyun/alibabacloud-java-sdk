// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyJobGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyJobGroupResponseBody body;

    public static ModifyJobGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyJobGroupResponse self = new ModifyJobGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyJobGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyJobGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyJobGroupResponse setBody(ModifyJobGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyJobGroupResponseBody getBody() {
        return this.body;
    }

}
