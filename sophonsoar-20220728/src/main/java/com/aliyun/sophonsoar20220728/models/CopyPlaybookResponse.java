// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class CopyPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyPlaybookResponseBody body;

    public static CopyPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyPlaybookResponse self = new CopyPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public CopyPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyPlaybookResponse setBody(CopyPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyPlaybookResponseBody getBody() {
        return this.body;
    }

}
