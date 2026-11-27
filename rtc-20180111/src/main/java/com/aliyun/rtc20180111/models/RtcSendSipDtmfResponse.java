// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class RtcSendSipDtmfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RtcSendSipDtmfResponseBody body;

    public static RtcSendSipDtmfResponse build(java.util.Map<String, ?> map) throws Exception {
        RtcSendSipDtmfResponse self = new RtcSendSipDtmfResponse();
        return TeaModel.build(map, self);
    }

    public RtcSendSipDtmfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RtcSendSipDtmfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RtcSendSipDtmfResponse setBody(RtcSendSipDtmfResponseBody body) {
        this.body = body;
        return this;
    }
    public RtcSendSipDtmfResponseBody getBody() {
        return this.body;
    }

}
