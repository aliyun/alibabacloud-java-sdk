// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateVulAutoRepairConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVulAutoRepairConfigResponseBody body;

    public static CreateVulAutoRepairConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVulAutoRepairConfigResponse self = new CreateVulAutoRepairConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateVulAutoRepairConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVulAutoRepairConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVulAutoRepairConfigResponse setBody(CreateVulAutoRepairConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVulAutoRepairConfigResponseBody getBody() {
        return this.body;
    }

}
