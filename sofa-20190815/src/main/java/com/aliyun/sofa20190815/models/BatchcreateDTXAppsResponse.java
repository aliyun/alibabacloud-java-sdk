// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchcreateDTXAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchcreateDTXAppsResponseBody body;

    public static BatchcreateDTXAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDTXAppsResponse self = new BatchcreateDTXAppsResponse();
        return TeaModel.build(map, self);
    }

    public BatchcreateDTXAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchcreateDTXAppsResponse setBody(BatchcreateDTXAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchcreateDTXAppsResponseBody getBody() {
        return this.body;
    }

}
