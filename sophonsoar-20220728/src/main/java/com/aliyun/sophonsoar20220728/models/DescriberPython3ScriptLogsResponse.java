// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescriberPython3ScriptLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescriberPython3ScriptLogsResponseBody body;

    public static DescriberPython3ScriptLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescriberPython3ScriptLogsResponse self = new DescriberPython3ScriptLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescriberPython3ScriptLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescriberPython3ScriptLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescriberPython3ScriptLogsResponse setBody(DescriberPython3ScriptLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescriberPython3ScriptLogsResponseBody getBody() {
        return this.body;
    }

}
