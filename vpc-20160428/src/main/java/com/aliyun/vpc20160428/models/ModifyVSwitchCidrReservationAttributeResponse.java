// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVSwitchCidrReservationAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVSwitchCidrReservationAttributeResponseBody body;

    public static ModifyVSwitchCidrReservationAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchCidrReservationAttributeResponse self = new ModifyVSwitchCidrReservationAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchCidrReservationAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVSwitchCidrReservationAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVSwitchCidrReservationAttributeResponse setBody(ModifyVSwitchCidrReservationAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVSwitchCidrReservationAttributeResponseBody getBody() {
        return this.body;
    }

}
