// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateTicketRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FormData")
    public String formData;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OperatorId")
    public Long operatorId;

    @NameInMap("TicketId")
    public Long ticketId;

    public static UpdateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketRequest self = new UpdateTicketRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTicketRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public UpdateTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTicketRequest setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Long getOperatorId() {
        return this.operatorId;
    }

    public UpdateTicketRequest setTicketId(Long ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public Long getTicketId() {
        return this.ticketId;
    }

}
