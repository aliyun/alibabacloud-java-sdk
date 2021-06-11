// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAiotVehicleTableItemResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static DeleteAiotVehicleTableItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAiotVehicleTableItemResponseBody self = new DeleteAiotVehicleTableItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAiotVehicleTableItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAiotVehicleTableItemResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAiotVehicleTableItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
