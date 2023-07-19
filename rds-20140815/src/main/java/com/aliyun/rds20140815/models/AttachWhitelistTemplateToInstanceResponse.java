// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AttachWhitelistTemplateToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AttachWhitelistTemplateToInstanceResponseBody body;

    public static AttachWhitelistTemplateToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachWhitelistTemplateToInstanceResponse self = new AttachWhitelistTemplateToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AttachWhitelistTemplateToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachWhitelistTemplateToInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachWhitelistTemplateToInstanceResponse setBody(AttachWhitelistTemplateToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachWhitelistTemplateToInstanceResponseBody getBody() {
        return this.body;
    }

}
