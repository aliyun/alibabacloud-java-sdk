// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateDesktopImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDesktopImageResponseBody body;

    public static CreateDesktopImageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopImageResponse self = new CreateDesktopImageResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDesktopImageResponse setBody(CreateDesktopImageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopImageResponseBody getBody() {
        return this.body;
    }

}
