// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class EnableInternalSlbResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInternalSlbResponseBody body;

    public static EnableInternalSlbResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInternalSlbResponse self = new EnableInternalSlbResponse();
        return TeaModel.build(map, self);
    }

    public EnableInternalSlbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInternalSlbResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInternalSlbResponse setBody(EnableInternalSlbResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInternalSlbResponseBody getBody() {
        return this.body;
    }

}
