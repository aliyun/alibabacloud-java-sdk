// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveOutputFileToResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveOutputFileToResourceResponseBody body;

    public static SaveOutputFileToResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOutputFileToResourceResponse self = new SaveOutputFileToResourceResponse();
        return TeaModel.build(map, self);
    }

    public SaveOutputFileToResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOutputFileToResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveOutputFileToResourceResponse setBody(SaveOutputFileToResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOutputFileToResourceResponseBody getBody() {
        return this.body;
    }

}
