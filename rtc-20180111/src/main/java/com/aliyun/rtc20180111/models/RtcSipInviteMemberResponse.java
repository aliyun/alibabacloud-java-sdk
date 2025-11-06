// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSipInviteMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RtcSipInviteMemberResponseBody body;

    public static RtcSipInviteMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        RtcSipInviteMemberResponse self = new RtcSipInviteMemberResponse();
        return TeaModel.build(map, self);
    }

    public RtcSipInviteMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RtcSipInviteMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RtcSipInviteMemberResponse setBody(RtcSipInviteMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public RtcSipInviteMemberResponseBody getBody() {
        return this.body;
    }

}
