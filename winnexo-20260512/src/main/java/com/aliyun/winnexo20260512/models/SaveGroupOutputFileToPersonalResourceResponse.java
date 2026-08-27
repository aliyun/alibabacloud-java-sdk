// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToPersonalResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveGroupOutputFileToPersonalResourceResponseBody body;

    public static SaveGroupOutputFileToPersonalResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToPersonalResourceResponse self = new SaveGroupOutputFileToPersonalResourceResponse();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToPersonalResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveGroupOutputFileToPersonalResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveGroupOutputFileToPersonalResourceResponse setBody(SaveGroupOutputFileToPersonalResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveGroupOutputFileToPersonalResourceResponseBody getBody() {
        return this.body;
    }

}
