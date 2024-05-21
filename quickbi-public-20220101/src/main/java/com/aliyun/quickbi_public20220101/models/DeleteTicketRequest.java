// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteTicketRequest extends TeaModel {
    /**
     * <p>Deletes a specified ticket from an embedded report.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static DeleteTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTicketRequest self = new DeleteTicketRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTicketRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
