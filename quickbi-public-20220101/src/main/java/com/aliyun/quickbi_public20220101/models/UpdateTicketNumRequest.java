// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateTicketNumRequest extends TeaModel {
    @NameInMap("Ticket")
    public String ticket;

    @NameInMap("TicketNum")
    public Integer ticketNum;

    public static UpdateTicketNumRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketNumRequest self = new UpdateTicketNumRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketNumRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public UpdateTicketNumRequest setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
        return this;
    }
    public Integer getTicketNum() {
        return this.ticketNum;
    }

}
