// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StartDesktopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartDesktopResponseBody body;

    public static StartDesktopResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopResponse self = new StartDesktopResponse();
        return TeaModel.build(map, self);
    }

    public StartDesktopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartDesktopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartDesktopResponse setBody(StartDesktopResponseBody body) {
        this.body = body;
        return this;
    }
    public StartDesktopResponseBody getBody() {
        return this.body;
    }

}
