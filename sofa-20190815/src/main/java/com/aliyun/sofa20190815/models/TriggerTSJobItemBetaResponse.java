// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class TriggerTSJobItemBetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerTSJobItemBetaResponseBody body;

    public static TriggerTSJobItemBetaResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerTSJobItemBetaResponse self = new TriggerTSJobItemBetaResponse();
        return TeaModel.build(map, self);
    }

    public TriggerTSJobItemBetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerTSJobItemBetaResponse setBody(TriggerTSJobItemBetaResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerTSJobItemBetaResponseBody getBody() {
        return this.body;
    }

}
