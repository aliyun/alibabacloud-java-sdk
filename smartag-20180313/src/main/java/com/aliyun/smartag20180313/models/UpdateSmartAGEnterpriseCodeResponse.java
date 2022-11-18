// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpdateSmartAGEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSmartAGEnterpriseCodeResponseBody body;

    public static UpdateSmartAGEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartAGEnterpriseCodeResponse self = new UpdateSmartAGEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSmartAGEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSmartAGEnterpriseCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSmartAGEnterpriseCodeResponse setBody(UpdateSmartAGEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSmartAGEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
