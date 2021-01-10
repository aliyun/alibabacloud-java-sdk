// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryDmsMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryDmsMsgResponseBody body;

    public static BatchqueryDmsMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryDmsMsgResponse self = new BatchqueryDmsMsgResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryDmsMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryDmsMsgResponse setBody(BatchqueryDmsMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryDmsMsgResponseBody getBody() {
        return this.body;
    }

}
