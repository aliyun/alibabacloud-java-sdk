// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdatePublicIpAddressPoolAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePublicIpAddressPoolAttributeResponseBody body;

    public static UpdatePublicIpAddressPoolAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicIpAddressPoolAttributeResponse self = new UpdatePublicIpAddressPoolAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePublicIpAddressPoolAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePublicIpAddressPoolAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePublicIpAddressPoolAttributeResponse setBody(UpdatePublicIpAddressPoolAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePublicIpAddressPoolAttributeResponseBody getBody() {
        return this.body;
    }

}
