// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVSwitchCidrReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVSwitchCidrReservationResponseBody body;

    public static CreateVSwitchCidrReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchCidrReservationResponse self = new CreateVSwitchCidrReservationResponse();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchCidrReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVSwitchCidrReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVSwitchCidrReservationResponse setBody(CreateVSwitchCidrReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVSwitchCidrReservationResponseBody getBody() {
        return this.body;
    }

}
