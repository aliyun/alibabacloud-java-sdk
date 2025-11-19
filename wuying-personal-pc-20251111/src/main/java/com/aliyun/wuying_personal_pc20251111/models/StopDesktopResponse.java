// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StopDesktopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDesktopResponseBody body;

    public static StopDesktopResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopResponse self = new StopDesktopResponse();
        return TeaModel.build(map, self);
    }

    public StopDesktopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDesktopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDesktopResponse setBody(StopDesktopResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDesktopResponseBody getBody() {
        return this.body;
    }

}
