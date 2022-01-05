// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class SaveOdpsInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOdpsInstanceResponseBody body;

    public static SaveOdpsInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOdpsInstanceResponse self = new SaveOdpsInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SaveOdpsInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOdpsInstanceResponse setBody(SaveOdpsInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOdpsInstanceResponseBody getBody() {
        return this.body;
    }

}
