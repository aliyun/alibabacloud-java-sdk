// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class CreateCustomerModuleBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomerModuleBasicInfoResponseBody body;

    public static CreateCustomerModuleBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerModuleBasicInfoResponse self = new CreateCustomerModuleBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomerModuleBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomerModuleBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomerModuleBasicInfoResponse setBody(CreateCustomerModuleBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomerModuleBasicInfoResponseBody getBody() {
        return this.body;
    }

}
