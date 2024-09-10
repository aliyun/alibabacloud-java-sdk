// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DingTalkOnlineTestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DingTalkOnlineTestResponseBody body;

    public static DingTalkOnlineTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DingTalkOnlineTestResponse self = new DingTalkOnlineTestResponse();
        return TeaModel.build(map, self);
    }

    public DingTalkOnlineTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DingTalkOnlineTestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DingTalkOnlineTestResponse setBody(DingTalkOnlineTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DingTalkOnlineTestResponseBody getBody() {
        return this.body;
    }

}
