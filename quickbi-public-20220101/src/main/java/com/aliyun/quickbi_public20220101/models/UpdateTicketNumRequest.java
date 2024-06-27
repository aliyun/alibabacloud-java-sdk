// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateTicketNumRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>040e6f79d33444838***83c7206c070</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
