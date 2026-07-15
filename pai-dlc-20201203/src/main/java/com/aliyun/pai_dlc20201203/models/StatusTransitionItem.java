// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class StatusTransitionItem extends TeaModel {
    /**
     * <p>The end time of this status (UTC).</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The reason code for this status.</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <p>The detailed message for this status.</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <p>The start time of this status (UTC).</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The job status.</p>
     */
    @NameInMap("Status")
    public String status;

    public static StatusTransitionItem build(java.util.Map<String, ?> map) throws Exception {
        StatusTransitionItem self = new StatusTransitionItem();
        return TeaModel.build(map, self);
    }

    public StatusTransitionItem setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public StatusTransitionItem setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public StatusTransitionItem setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public StatusTransitionItem setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public StatusTransitionItem setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
