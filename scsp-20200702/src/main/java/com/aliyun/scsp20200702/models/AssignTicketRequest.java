// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class AssignTicketRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TicketId")
    public Long ticketId;

    @NameInMap("OperatorId")
    public Long operatorId;

    @NameInMap("AcceptorId")
    public Long acceptorId;

    public static AssignTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketRequest self = new AssignTicketRequest();
        return TeaModel.build(map, self);
    }

    public AssignTicketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AssignTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AssignTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

    public AssignTicketRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

    public AssignTicketRequest setAcceptorId(Long acceptorId) {
        this.acceptorId = acceptorId;
        return this;
    }
    public Long getAcceptorId() {
        return this.acceptorId;
    }

}
