// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateCustomerModuleOutputInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomerModuleOutputInfoResponseBody body;

    public static CreateCustomerModuleOutputInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerModuleOutputInfoResponse self = new CreateCustomerModuleOutputInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomerModuleOutputInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomerModuleOutputInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomerModuleOutputInfoResponse setBody(CreateCustomerModuleOutputInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomerModuleOutputInfoResponseBody getBody() {
        return this.body;
    }

}
