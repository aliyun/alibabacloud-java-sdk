// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyPolarFsInstanceDescriptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPolarFsInstanceDescriptionResponseBody body;

    public static ModifyPolarFsInstanceDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolarFsInstanceDescriptionResponse self = new ModifyPolarFsInstanceDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPolarFsInstanceDescriptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPolarFsInstanceDescriptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPolarFsInstanceDescriptionResponse setBody(ModifyPolarFsInstanceDescriptionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPolarFsInstanceDescriptionResponseBody getBody() {
        return this.body;
    }

}
