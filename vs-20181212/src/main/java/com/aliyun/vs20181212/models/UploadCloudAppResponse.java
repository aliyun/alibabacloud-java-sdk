// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadCloudAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCloudAppResponseBody body;

    public static UploadCloudAppResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCloudAppResponse self = new UploadCloudAppResponse();
        return TeaModel.build(map, self);
    }

    public UploadCloudAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCloudAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCloudAppResponse setBody(UploadCloudAppResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCloudAppResponseBody getBody() {
        return this.body;
    }

}
