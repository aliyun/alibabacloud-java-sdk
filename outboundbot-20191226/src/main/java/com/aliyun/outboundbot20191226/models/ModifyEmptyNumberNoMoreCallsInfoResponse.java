// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyEmptyNumberNoMoreCallsInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyEmptyNumberNoMoreCallsInfoResponseBody body;

    public static ModifyEmptyNumberNoMoreCallsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEmptyNumberNoMoreCallsInfoResponse self = new ModifyEmptyNumberNoMoreCallsInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEmptyNumberNoMoreCallsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEmptyNumberNoMoreCallsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyEmptyNumberNoMoreCallsInfoResponse setBody(ModifyEmptyNumberNoMoreCallsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEmptyNumberNoMoreCallsInfoResponseBody getBody() {
        return this.body;
    }

}
