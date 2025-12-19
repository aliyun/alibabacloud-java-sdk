// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RefreshAppInstanceTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefreshAppInstanceTicketResponseBody body;

    public static RefreshAppInstanceTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshAppInstanceTicketResponse self = new RefreshAppInstanceTicketResponse();
        return TeaModel.build(map, self);
    }

    public RefreshAppInstanceTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshAppInstanceTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshAppInstanceTicketResponse setBody(RefreshAppInstanceTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshAppInstanceTicketResponseBody getBody() {
        return this.body;
    }

}
