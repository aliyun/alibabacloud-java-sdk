// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteVulAutoRepairConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVulAutoRepairConfigResponseBody body;

    public static DeleteVulAutoRepairConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVulAutoRepairConfigResponse self = new DeleteVulAutoRepairConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVulAutoRepairConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVulAutoRepairConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVulAutoRepairConfigResponse setBody(DeleteVulAutoRepairConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVulAutoRepairConfigResponseBody getBody() {
        return this.body;
    }

}
