// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVSwitchCidrReservationUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVSwitchCidrReservationUsageResponseBody body;

    public static GetVSwitchCidrReservationUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVSwitchCidrReservationUsageResponse self = new GetVSwitchCidrReservationUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetVSwitchCidrReservationUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVSwitchCidrReservationUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVSwitchCidrReservationUsageResponse setBody(GetVSwitchCidrReservationUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVSwitchCidrReservationUsageResponseBody getBody() {
        return this.body;
    }

}
