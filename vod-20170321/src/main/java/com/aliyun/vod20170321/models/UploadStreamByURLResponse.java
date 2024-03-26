// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class UploadStreamByURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadStreamByURLResponseBody body;

    public static UploadStreamByURLResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadStreamByURLResponse self = new UploadStreamByURLResponse();
        return TeaModel.build(map, self);
    }

    public UploadStreamByURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadStreamByURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadStreamByURLResponse setBody(UploadStreamByURLResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadStreamByURLResponseBody getBody() {
        return this.body;
    }

}
