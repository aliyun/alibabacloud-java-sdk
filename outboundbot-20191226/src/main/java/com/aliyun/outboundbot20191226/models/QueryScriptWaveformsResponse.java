// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class QueryScriptWaveformsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryScriptWaveformsResponseBody body;

    public static QueryScriptWaveformsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptWaveformsResponse self = new QueryScriptWaveformsResponse();
        return TeaModel.build(map, self);
    }

    public QueryScriptWaveformsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScriptWaveformsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScriptWaveformsResponse setBody(QueryScriptWaveformsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScriptWaveformsResponseBody getBody() {
        return this.body;
    }

}
