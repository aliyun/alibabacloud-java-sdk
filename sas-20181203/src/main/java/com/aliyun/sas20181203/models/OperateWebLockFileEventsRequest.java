// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateWebLockFileEventsRequest extends TeaModel {
    /**
     * <p>Specifies whether to handle all alert events that are generated for web tamper proofing. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("DealAll")
    public Integer dealAll;

    /**
     * <p>The IDs of alert events.</p>
     */
    @NameInMap("EventIds")
    public java.util.List<Long> eventIds;

    /**
     * <p>The operation that you want to perform on the alert events. Valid values:</p>
     * <br>
     * <p>*   **mark_mis_info**: marks the alert events as false positives</p>
     * <p>*   **rm_mark_mis_info**: cancels marking the alerts events as false positives</p>
     * <p>*   **offline_handled**: marks the alert events as handled offline</p>
     * <p>*   **whitelist**: adds the alert events to the whitelist</p>
     * <p>*   **rm_whitelist**: cancels adding the alert events to the whitelist</p>
     */
    @NameInMap("OperationCode")
    public String operationCode;

    public static OperateWebLockFileEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateWebLockFileEventsRequest self = new OperateWebLockFileEventsRequest();
        return TeaModel.build(map, self);
    }

    public OperateWebLockFileEventsRequest setDealAll(Integer dealAll) {
        this.dealAll = dealAll;
        return this;
    }
    public Integer getDealAll() {
        return this.dealAll;
    }

    public OperateWebLockFileEventsRequest setEventIds(java.util.List<Long> eventIds) {
        this.eventIds = eventIds;
        return this;
    }
    public java.util.List<Long> getEventIds() {
        return this.eventIds;
    }

    public OperateWebLockFileEventsRequest setOperationCode(String operationCode) {
        this.operationCode = operationCode;
        return this;
    }
    public String getOperationCode() {
        return this.operationCode;
    }

}
