// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveClriskModelResponseBody body;

    public static SaveClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskModelResponse self = new SaveClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public SaveClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveClriskModelResponse setBody(SaveClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClriskModelResponseBody getBody() {
        return this.body;
    }

}
