// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>end-5zk866779me51jgu3w,end-5zk866779me51jgu3w</p>
     */
    @NameInMap("EndpointIds")
    public String endpointIds;

    /**
     * <strong>example:</strong>
     * <p>A731A84D-55C9-44F7-99BB-E1CF0CF19197</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>slot-5zk866779me51jgu3w</p>
     */
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
