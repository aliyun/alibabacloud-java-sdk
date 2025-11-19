// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDesktopImageResponseBody body;

    public static DeleteDesktopImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopImageResponse self = new DeleteDesktopImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDesktopImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDesktopImageResponse setBody(DeleteDesktopImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDesktopImageResponseBody getBody() {
        return this.body;
    }

}
