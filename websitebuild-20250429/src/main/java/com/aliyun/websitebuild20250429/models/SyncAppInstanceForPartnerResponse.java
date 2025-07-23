// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class SyncAppInstanceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncAppInstanceForPartnerResponseBody body;

    public static SyncAppInstanceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAppInstanceForPartnerResponse self = new SyncAppInstanceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public SyncAppInstanceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncAppInstanceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncAppInstanceForPartnerResponse setBody(SyncAppInstanceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncAppInstanceForPartnerResponseBody getBody() {
        return this.body;
    }

}
