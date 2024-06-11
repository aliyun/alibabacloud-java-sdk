// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class CreateVirtualMFADeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVirtualMFADeviceResponseBody body;

    public static CreateVirtualMFADeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualMFADeviceResponse self = new CreateVirtualMFADeviceResponse();
        return TeaModel.build(map, self);
    }

    public CreateVirtualMFADeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVirtualMFADeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVirtualMFADeviceResponse setBody(CreateVirtualMFADeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

}
