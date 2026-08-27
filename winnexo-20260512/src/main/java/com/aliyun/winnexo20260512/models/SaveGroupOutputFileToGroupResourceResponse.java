// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class SaveGroupOutputFileToGroupResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveGroupOutputFileToGroupResourceResponseBody body;

    public static SaveGroupOutputFileToGroupResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveGroupOutputFileToGroupResourceResponse self = new SaveGroupOutputFileToGroupResourceResponse();
        return TeaModel.build(map, self);
    }

    public SaveGroupOutputFileToGroupResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveGroupOutputFileToGroupResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveGroupOutputFileToGroupResourceResponse setBody(SaveGroupOutputFileToGroupResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveGroupOutputFileToGroupResourceResponseBody getBody() {
        return this.body;
    }

}
