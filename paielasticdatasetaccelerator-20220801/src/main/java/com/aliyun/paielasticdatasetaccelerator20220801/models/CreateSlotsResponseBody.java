// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateSlotsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SlotIds")
    public String slotIds;

    @NameInMap("Summary")
    public java.util.Map<String, String> summary;

    public static CreateSlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSlotsResponseBody self = new CreateSlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSlotsResponseBody setSlotIds(String slotIds) {
        this.slotIds = slotIds;
        return this;
    }
    public String getSlotIds() {
        return this.slotIds;
    }

    public CreateSlotsResponseBody setSummary(java.util.Map<String, String> summary) {
        this.summary = summary;
        return this;
    }
    public java.util.Map<String, String> getSummary() {
        return this.summary;
    }

}
