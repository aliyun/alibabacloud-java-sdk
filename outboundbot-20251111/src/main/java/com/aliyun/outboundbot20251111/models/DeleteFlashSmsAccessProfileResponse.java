// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class DeleteFlashSmsAccessProfileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFlashSmsAccessProfileResponseBody body;

    public static DeleteFlashSmsAccessProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlashSmsAccessProfileResponse self = new DeleteFlashSmsAccessProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFlashSmsAccessProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFlashSmsAccessProfileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFlashSmsAccessProfileResponse setBody(DeleteFlashSmsAccessProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFlashSmsAccessProfileResponseBody getBody() {
        return this.body;
    }

}
