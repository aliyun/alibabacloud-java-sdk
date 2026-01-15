// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RefundAppInstanceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefundAppInstanceForPartnerResponseBody body;

    public static RefundAppInstanceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        RefundAppInstanceForPartnerResponse self = new RefundAppInstanceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public RefundAppInstanceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefundAppInstanceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefundAppInstanceForPartnerResponse setBody(RefundAppInstanceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public RefundAppInstanceForPartnerResponseBody getBody() {
        return this.body;
    }

}
