// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class PushMessageToiOSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushMessageToiOSResponseBody body;

    public static PushMessageToiOSResponse build(java.util.Map<String, ?> map) throws Exception {
        PushMessageToiOSResponse self = new PushMessageToiOSResponse();
        return TeaModel.build(map, self);
    }

    public PushMessageToiOSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushMessageToiOSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushMessageToiOSResponse setBody(PushMessageToiOSResponseBody body) {
        this.body = body;
        return this;
    }
    public PushMessageToiOSResponseBody getBody() {
        return this.body;
    }

}
