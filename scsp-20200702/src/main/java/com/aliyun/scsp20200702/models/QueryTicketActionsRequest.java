// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryTicketActionsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("ActionCodeList")
    public java.util.List<Integer> actionCodeList;

    public static QueryTicketActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionsRequest self = new QueryTicketActionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTicketActionsRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public QueryTicketActionsRequest setActionCodeList(java.util.List<Integer> actionCodeList) {
        this.actionCodeList = actionCodeList;
        return this;
    }
    public java.util.List<Integer> getActionCodeList() {
        return this.actionCodeList;
    }

}
