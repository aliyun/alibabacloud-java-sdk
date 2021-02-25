// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ExecuteActivityRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("OperatorId")
    public Long operatorId;

    @NameInMap("ActivityCode")
    public String activityCode;

    @NameInMap("ActivityForm")
    public String activityForm;

    public static ExecuteActivityRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteActivityRequest self = new ExecuteActivityRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteActivityRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteActivityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecuteActivityRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public ExecuteActivityRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

    public ExecuteActivityRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public ExecuteActivityRequest setActivityForm(String activityForm) {
        this.activityForm = activityForm;
        return this;
    }
    public String getActivityForm() {
        return this.activityForm;
    }

}
