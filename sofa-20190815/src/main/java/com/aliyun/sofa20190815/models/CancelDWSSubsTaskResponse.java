// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelDWSSubsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelDWSSubsTaskResponseBody body;

    public static CancelDWSSubsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelDWSSubsTaskResponse self = new CancelDWSSubsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CancelDWSSubsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelDWSSubsTaskResponse setBody(CancelDWSSubsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelDWSSubsTaskResponseBody getBody() {
        return this.body;
    }

}
