// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyParameterGroupResponse setBody(ModifyParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParameterGroupResponseBody getBody() {
        return this.body;
    }

}
