// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteVSwitchCidrReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVSwitchCidrReservationResponseBody body;

    public static DeleteVSwitchCidrReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVSwitchCidrReservationResponse self = new DeleteVSwitchCidrReservationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVSwitchCidrReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVSwitchCidrReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVSwitchCidrReservationResponse setBody(DeleteVSwitchCidrReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVSwitchCidrReservationResponseBody getBody() {
        return this.body;
    }

}
