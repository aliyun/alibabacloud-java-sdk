// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDesktopResponseBody body;

    public static DeleteDesktopResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopResponse self = new DeleteDesktopResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDesktopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDesktopResponse setBody(DeleteDesktopResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDesktopResponseBody getBody() {
        return this.body;
    }

}
