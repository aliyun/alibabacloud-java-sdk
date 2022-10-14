// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class AsyncResourcePlanOperationResult extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("plan")
    public String plan;

    @NameInMap("ticketStatus")
    public String ticketStatus;

    public static AsyncResourcePlanOperationResult build(java.util.Map<String, ?> map) throws Exception {
        AsyncResourcePlanOperationResult self = new AsyncResourcePlanOperationResult();
        return TeaModel.build(map, self);
    }

    public AsyncResourcePlanOperationResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AsyncResourcePlanOperationResult setPlan(String plan) {
        this.plan = plan;
        return this;
    }
    public String getPlan() {
        return this.plan;
    }

    public AsyncResourcePlanOperationResult setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
        return this;
    }
    public String getTicketStatus() {
        return this.ticketStatus;
    }

}
