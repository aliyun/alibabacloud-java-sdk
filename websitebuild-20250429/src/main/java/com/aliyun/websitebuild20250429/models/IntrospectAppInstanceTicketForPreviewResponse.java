// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class IntrospectAppInstanceTicketForPreviewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IntrospectAppInstanceTicketForPreviewResponseBody body;

    public static IntrospectAppInstanceTicketForPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        IntrospectAppInstanceTicketForPreviewResponse self = new IntrospectAppInstanceTicketForPreviewResponse();
        return TeaModel.build(map, self);
    }

    public IntrospectAppInstanceTicketForPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IntrospectAppInstanceTicketForPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IntrospectAppInstanceTicketForPreviewResponse setBody(IntrospectAppInstanceTicketForPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public IntrospectAppInstanceTicketForPreviewResponseBody getBody() {
        return this.body;
    }

}
