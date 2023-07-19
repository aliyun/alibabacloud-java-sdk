// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetachWhitelistTemplateToInstanceResponseBody body;

    public static DetachWhitelistTemplateToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachWhitelistTemplateToInstanceResponse self = new DetachWhitelistTemplateToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DetachWhitelistTemplateToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachWhitelistTemplateToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachWhitelistTemplateToInstanceResponse setBody(DetachWhitelistTemplateToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachWhitelistTemplateToInstanceResponseBody getBody() {
        return this.body;
    }

}
