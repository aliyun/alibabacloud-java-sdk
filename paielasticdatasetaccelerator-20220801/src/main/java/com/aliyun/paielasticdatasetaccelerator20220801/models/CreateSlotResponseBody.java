// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotResponseBody extends TeaModel {
    @NameInMap("EndpointIds")
    public String endpointIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlotId")
    public String slotId;

    public static CreateSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotResponseBody self = new CreateSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlotResponseBody setEndpointIds(String endpointIds) {
        this.endpointIds = endpointIds;
        return this;
    }
    public String getEndpointIds() {
        return this.endpointIds;
    }

    public CreateSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlotResponseBody setSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }
    public String getSlotId() {
        return this.slotId;
    }

}
