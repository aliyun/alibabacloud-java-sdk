// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVulAutoRepairConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVulAutoRepairConfigResponseBody body;

    public static ListVulAutoRepairConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVulAutoRepairConfigResponse self = new ListVulAutoRepairConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListVulAutoRepairConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVulAutoRepairConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVulAutoRepairConfigResponse setBody(ListVulAutoRepairConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVulAutoRepairConfigResponseBody getBody() {
        return this.body;
    }

}
