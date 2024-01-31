// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHoneypotProbeResponseBody body;

    public static ListHoneypotProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotProbeResponse self = new ListHoneypotProbeResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotProbeResponse setBody(ListHoneypotProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotProbeResponseBody getBody() {
        return this.body;
    }

}
