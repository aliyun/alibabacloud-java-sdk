// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetEmptyNumberNoMoreCallsInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEmptyNumberNoMoreCallsInfoResponseBody body;

    public static GetEmptyNumberNoMoreCallsInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEmptyNumberNoMoreCallsInfoResponse self = new GetEmptyNumberNoMoreCallsInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetEmptyNumberNoMoreCallsInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEmptyNumberNoMoreCallsInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEmptyNumberNoMoreCallsInfoResponse setBody(GetEmptyNumberNoMoreCallsInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEmptyNumberNoMoreCallsInfoResponseBody getBody() {
        return this.body;
    }

}
