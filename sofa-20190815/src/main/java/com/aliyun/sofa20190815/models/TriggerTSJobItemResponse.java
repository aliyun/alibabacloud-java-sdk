// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class TriggerTSJobItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerTSJobItemResponseBody body;

    public static TriggerTSJobItemResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerTSJobItemResponse self = new TriggerTSJobItemResponse();
        return TeaModel.build(map, self);
    }

    public TriggerTSJobItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerTSJobItemResponse setBody(TriggerTSJobItemResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerTSJobItemResponseBody getBody() {
        return this.body;
    }

}
