// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddRoomPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddRoomPlanResponseBody body;

    public static AddRoomPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRoomPlanResponse self = new AddRoomPlanResponse();
        return TeaModel.build(map, self);
    }

    public AddRoomPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddRoomPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddRoomPlanResponse setBody(AddRoomPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public AddRoomPlanResponseBody getBody() {
        return this.body;
    }

}
