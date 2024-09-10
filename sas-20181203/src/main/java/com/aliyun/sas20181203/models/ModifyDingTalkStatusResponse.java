// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyDingTalkStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDingTalkStatusResponseBody body;

    public static ModifyDingTalkStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDingTalkStatusResponse self = new ModifyDingTalkStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDingTalkStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDingTalkStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDingTalkStatusResponse setBody(ModifyDingTalkStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDingTalkStatusResponseBody getBody() {
        return this.body;
    }

}
