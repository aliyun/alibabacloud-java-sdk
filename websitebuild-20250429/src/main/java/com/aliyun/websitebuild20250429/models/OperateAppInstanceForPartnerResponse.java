// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppInstanceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAppInstanceForPartnerResponseBody body;

    public static OperateAppInstanceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAppInstanceForPartnerResponse self = new OperateAppInstanceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public OperateAppInstanceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAppInstanceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAppInstanceForPartnerResponse setBody(OperateAppInstanceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAppInstanceForPartnerResponseBody getBody() {
        return this.body;
    }

}
