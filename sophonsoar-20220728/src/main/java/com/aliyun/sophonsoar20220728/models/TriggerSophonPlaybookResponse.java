// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerSophonPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TriggerSophonPlaybookResponseBody body;

    public static TriggerSophonPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerSophonPlaybookResponse self = new TriggerSophonPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public TriggerSophonPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerSophonPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerSophonPlaybookResponse setBody(TriggerSophonPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerSophonPlaybookResponseBody getBody() {
        return this.body;
    }

}
