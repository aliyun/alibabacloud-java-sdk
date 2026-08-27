// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateAnnouncementResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnnouncementResponseBody body;

    public static CreateAnnouncementResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnouncementResponse self = new CreateAnnouncementResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnnouncementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnnouncementResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnnouncementResponse setBody(CreateAnnouncementResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnnouncementResponseBody getBody() {
        return this.body;
    }

}
