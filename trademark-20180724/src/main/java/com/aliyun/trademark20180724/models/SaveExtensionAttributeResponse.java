// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveExtensionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveExtensionAttributeResponseBody body;

    public static SaveExtensionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveExtensionAttributeResponse self = new SaveExtensionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public SaveExtensionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveExtensionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveExtensionAttributeResponse setBody(SaveExtensionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveExtensionAttributeResponseBody getBody() {
        return this.body;
    }

}
