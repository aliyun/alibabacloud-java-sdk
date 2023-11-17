// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class TriggerPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TriggerPlaybookResponseBody body;

    public static TriggerPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        TriggerPlaybookResponse self = new TriggerPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public TriggerPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TriggerPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TriggerPlaybookResponse setBody(TriggerPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public TriggerPlaybookResponseBody getBody() {
        return this.body;
    }

}
