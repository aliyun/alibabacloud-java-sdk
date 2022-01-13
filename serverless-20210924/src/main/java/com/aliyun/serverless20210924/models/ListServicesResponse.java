// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<Service> body;

    public static ListServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServicesResponse self = new ListServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServicesResponse setBody(java.util.List<Service> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Service> getBody() {
        return this.body;
    }

}
