// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CloseTicketRequest extends TeaModel {
    @NameInMap("ActionItems")
    public String actionItems;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperatorId")
    public Long operatorId;

    @NameInMap("TicketId")
    public Long ticketId;

    public static CloseTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketRequest self = new CloseTicketRequest();
        return TeaModel.build(map, self);
    }

    public CloseTicketRequest setActionItems(String actionItems) {
        this.actionItems = actionItems;
        return this;
    }
    public String getActionItems() {
        return this.actionItems;
    }

    public CloseTicketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloseTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CloseTicketRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

    public CloseTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

}
