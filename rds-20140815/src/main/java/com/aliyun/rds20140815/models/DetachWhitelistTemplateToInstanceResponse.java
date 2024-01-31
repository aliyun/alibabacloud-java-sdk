// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DetachWhitelistTemplateToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
