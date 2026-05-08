// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class UpdateYikeProductionMemberAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateYikeProductionMemberAuthResponseBody body;

    public static UpdateYikeProductionMemberAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateYikeProductionMemberAuthResponse self = new UpdateYikeProductionMemberAuthResponse();
        return TeaModel.build(map, self);
    }

    public UpdateYikeProductionMemberAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateYikeProductionMemberAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateYikeProductionMemberAuthResponse setBody(UpdateYikeProductionMemberAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateYikeProductionMemberAuthResponseBody getBody() {
        return this.body;
    }

}
