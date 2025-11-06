// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcCancelSipInviteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RtcCancelSipInviteResponseBody body;

    public static RtcCancelSipInviteResponse build(java.util.Map<String, ?> map) throws Exception {
        RtcCancelSipInviteResponse self = new RtcCancelSipInviteResponse();
        return TeaModel.build(map, self);
    }

    public RtcCancelSipInviteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RtcCancelSipInviteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RtcCancelSipInviteResponse setBody(RtcCancelSipInviteResponseBody body) {
        this.body = body;
        return this;
    }
    public RtcCancelSipInviteResponseBody getBody() {
        return this.body;
    }

}
