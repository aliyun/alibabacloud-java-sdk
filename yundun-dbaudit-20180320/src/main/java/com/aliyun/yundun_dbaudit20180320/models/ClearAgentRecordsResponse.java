// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class ClearAgentRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearAgentRecordsResponseBody body;

    public static ClearAgentRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearAgentRecordsResponse self = new ClearAgentRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ClearAgentRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearAgentRecordsResponse setBody(ClearAgentRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearAgentRecordsResponseBody getBody() {
        return this.body;
    }

}
