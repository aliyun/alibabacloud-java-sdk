// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class SaveOmsKafkaCertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveOmsKafkaCertResponseBody body;

    public static SaveOmsKafkaCertResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveOmsKafkaCertResponse self = new SaveOmsKafkaCertResponse();
        return TeaModel.build(map, self);
    }

    public SaveOmsKafkaCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveOmsKafkaCertResponse setBody(SaveOmsKafkaCertResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveOmsKafkaCertResponseBody getBody() {
        return this.body;
    }

}
