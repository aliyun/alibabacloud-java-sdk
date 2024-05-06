// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class CancelMessageContactUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelMessageContactUpdateResponseBody body;

    public static CancelMessageContactUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelMessageContactUpdateResponse self = new CancelMessageContactUpdateResponse();
        return TeaModel.build(map, self);
    }

    public CancelMessageContactUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelMessageContactUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelMessageContactUpdateResponse setBody(CancelMessageContactUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelMessageContactUpdateResponseBody getBody() {
        return this.body;
    }

}
