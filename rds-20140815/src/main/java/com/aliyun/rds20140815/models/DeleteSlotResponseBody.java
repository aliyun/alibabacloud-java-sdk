// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteSlotResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2875D608-A228-53D7-B8C9-35F13EDCF36D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the replication slot.</p>
     * 
     * <strong>example:</strong>
     * <p>slot_test01</p>
     */
    @NameInMap("SlotName")
    public String slotName;

    public static DeleteSlotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSlotResponseBody self = new DeleteSlotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSlotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSlotResponseBody setSlotName(String slotName) {
        this.slotName = slotName;
        return this;
    }
    public String getSlotName() {
        return this.slotName;
    }

}
