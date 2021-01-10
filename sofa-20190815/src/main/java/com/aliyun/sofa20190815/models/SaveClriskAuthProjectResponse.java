// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskAuthProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveClriskAuthProjectResponseBody body;

    public static SaveClriskAuthProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskAuthProjectResponse self = new SaveClriskAuthProjectResponse();
        return TeaModel.build(map, self);
    }

    public SaveClriskAuthProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveClriskAuthProjectResponse setBody(SaveClriskAuthProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveClriskAuthProjectResponseBody getBody() {
        return this.body;
    }

}
