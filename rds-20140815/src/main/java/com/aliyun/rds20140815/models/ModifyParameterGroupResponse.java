// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyParameterGroupResponseBody body;

    public static ModifyParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterGroupResponse self = new ModifyParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParameterGroupResponse setBody(ModifyParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParameterGroupResponseBody getBody() {
        return this.body;
    }

}
