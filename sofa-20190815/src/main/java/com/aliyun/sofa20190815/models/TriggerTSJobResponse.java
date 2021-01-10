// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class TriggerTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerTSJobResponseBody body;

    public static TriggerTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerTSJobResponse self = new TriggerTSJobResponse();
        return TeaModel.build(map, self);
    }

    public TriggerTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerTSJobResponse setBody(TriggerTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerTSJobResponseBody getBody() {
        return this.body;
    }

}
