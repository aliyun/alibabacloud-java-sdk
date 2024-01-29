// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyInstanceMajorVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceMajorVersionResponseBody body;

    public static ModifyInstanceMajorVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMajorVersionResponse self = new ModifyInstanceMajorVersionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMajorVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceMajorVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceMajorVersionResponse setBody(ModifyInstanceMajorVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceMajorVersionResponseBody getBody() {
        return this.body;
    }

}
