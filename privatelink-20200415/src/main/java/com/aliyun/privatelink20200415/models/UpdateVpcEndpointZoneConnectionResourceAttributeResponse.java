// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class UpdateVpcEndpointZoneConnectionResourceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body;

    public static UpdateVpcEndpointZoneConnectionResourceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateVpcEndpointZoneConnectionResourceAttributeResponse self = new UpdateVpcEndpointZoneConnectionResourceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateVpcEndpointZoneConnectionResourceAttributeResponse setBody(UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateVpcEndpointZoneConnectionResourceAttributeResponseBody getBody() {
        return this.body;
    }

}
