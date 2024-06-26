// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushNoticeToiOSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushNoticeToiOSResponseBody body;

    public static PushNoticeToiOSResponse build(java.util.Map<String, ?> map) throws Exception {
        PushNoticeToiOSResponse self = new PushNoticeToiOSResponse();
        return TeaModel.build(map, self);
    }

    public PushNoticeToiOSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushNoticeToiOSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushNoticeToiOSResponse setBody(PushNoticeToiOSResponseBody body) {
        this.body = body;
        return this;
    }
    public PushNoticeToiOSResponseBody getBody() {
        return this.body;
    }

}
