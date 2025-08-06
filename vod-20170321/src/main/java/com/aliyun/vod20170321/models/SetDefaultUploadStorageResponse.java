// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SetDefaultUploadStorageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDefaultUploadStorageResponseBody body;

    public static SetDefaultUploadStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultUploadStorageResponse self = new SetDefaultUploadStorageResponse();
        return TeaModel.build(map, self);
    }

    public SetDefaultUploadStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDefaultUploadStorageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDefaultUploadStorageResponse setBody(SetDefaultUploadStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDefaultUploadStorageResponseBody getBody() {
        return this.body;
    }

}
