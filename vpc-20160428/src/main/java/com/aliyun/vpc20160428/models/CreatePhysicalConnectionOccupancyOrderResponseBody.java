// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreatePhysicalConnectionOccupancyOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderResponseBody self = new CreatePhysicalConnectionOccupancyOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
