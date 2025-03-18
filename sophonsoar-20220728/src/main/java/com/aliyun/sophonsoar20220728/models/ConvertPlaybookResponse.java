// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class ConvertPlaybookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConvertPlaybookResponseBody body;

    public static ConvertPlaybookResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertPlaybookResponse self = new ConvertPlaybookResponse();
        return TeaModel.build(map, self);
    }

    public ConvertPlaybookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertPlaybookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertPlaybookResponse setBody(ConvertPlaybookResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertPlaybookResponseBody getBody() {
        return this.body;
    }

}
