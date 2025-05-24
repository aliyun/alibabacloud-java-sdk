// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class OperateAppServiceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OperateAppServiceForPartnerResponseBody body;

    public static OperateAppServiceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateAppServiceForPartnerResponse self = new OperateAppServiceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public OperateAppServiceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateAppServiceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateAppServiceForPartnerResponse setBody(OperateAppServiceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateAppServiceForPartnerResponseBody getBody() {
        return this.body;
    }

}
