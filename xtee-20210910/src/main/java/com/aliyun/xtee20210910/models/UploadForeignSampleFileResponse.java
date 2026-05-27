// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class UploadForeignSampleFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadForeignSampleFileResponseBody body;

    public static UploadForeignSampleFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadForeignSampleFileResponse self = new UploadForeignSampleFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadForeignSampleFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadForeignSampleFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadForeignSampleFileResponse setBody(UploadForeignSampleFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadForeignSampleFileResponseBody getBody() {
        return this.body;
    }

}
