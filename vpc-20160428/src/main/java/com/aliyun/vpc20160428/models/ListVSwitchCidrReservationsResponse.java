// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListVSwitchCidrReservationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListVSwitchCidrReservationsResponseBody body;

    public static ListVSwitchCidrReservationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVSwitchCidrReservationsResponse self = new ListVSwitchCidrReservationsResponse();
        return TeaModel.build(map, self);
    }

    public ListVSwitchCidrReservationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVSwitchCidrReservationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVSwitchCidrReservationsResponse setBody(ListVSwitchCidrReservationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVSwitchCidrReservationsResponseBody getBody() {
        return this.body;
    }

}
