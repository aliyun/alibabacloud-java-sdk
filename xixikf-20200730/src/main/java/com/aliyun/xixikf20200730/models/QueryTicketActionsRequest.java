// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryTicketActionsRequest extends TeaModel {
    @NameInMap("ActionCodeList")
    public java.util.List<Long> actionCodeList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TicketId")
    public String ticketId;

    public static QueryTicketActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketActionsRequest self = new QueryTicketActionsRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketActionsRequest setActionCodeList(java.util.List<Long> actionCodeList) {
        this.actionCodeList = actionCodeList;
        return this;
    }
    public java.util.List<Long> getActionCodeList() {
        return this.actionCodeList;
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

}
