// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class FileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FileUploadResponseBody body;

    public static FileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        FileUploadResponse self = new FileUploadResponse();
        return TeaModel.build(map, self);
    }

    public FileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileUploadResponse setBody(FileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public FileUploadResponseBody getBody() {
        return this.body;
    }

}
