// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteDynamicImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDynamicImageResponseBody body;

    public static DeleteDynamicImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicImageResponse self = new DeleteDynamicImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDynamicImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDynamicImageResponse setBody(DeleteDynamicImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDynamicImageResponseBody getBody() {
        return this.body;
    }

}
