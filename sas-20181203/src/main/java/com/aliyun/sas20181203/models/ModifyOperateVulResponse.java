// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyOperateVulResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyOperateVulResponseBody body;

    public static ModifyOperateVulResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOperateVulResponse self = new ModifyOperateVulResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOperateVulResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOperateVulResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOperateVulResponse setBody(ModifyOperateVulResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOperateVulResponseBody getBody() {
        return this.body;
    }

}
