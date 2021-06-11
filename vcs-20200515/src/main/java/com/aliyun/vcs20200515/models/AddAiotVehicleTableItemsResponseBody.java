// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotVehicleTableItemsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static AddAiotVehicleTableItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAiotVehicleTableItemsResponseBody self = new AddAiotVehicleTableItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAiotVehicleTableItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAiotVehicleTableItemsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAiotVehicleTableItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
