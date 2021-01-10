// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchdeleteDmsMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchdeleteDmsMsgResponseBody body;

    public static BatchdeleteDmsMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchdeleteDmsMsgResponse self = new BatchdeleteDmsMsgResponse();
        return TeaModel.build(map, self);
    }

    public BatchdeleteDmsMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchdeleteDmsMsgResponse setBody(BatchdeleteDmsMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchdeleteDmsMsgResponseBody getBody() {
        return this.body;
    }

}
