// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLakebaseMountParameterGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLakebaseMountParameterGroupResponseBody body;

    public static ModifyLakebaseMountParameterGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLakebaseMountParameterGroupResponse self = new ModifyLakebaseMountParameterGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLakebaseMountParameterGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLakebaseMountParameterGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLakebaseMountParameterGroupResponse setBody(ModifyLakebaseMountParameterGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLakebaseMountParameterGroupResponseBody getBody() {
        return this.body;
    }

}
