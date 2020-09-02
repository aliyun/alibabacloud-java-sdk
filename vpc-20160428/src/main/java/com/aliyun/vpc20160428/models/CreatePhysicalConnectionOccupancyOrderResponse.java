// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderResponse extends TeaModel {
    // description: The ID of the request.; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static CreatePhysicalConnectionOccupancyOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderResponse self = new CreatePhysicalConnectionOccupancyOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
