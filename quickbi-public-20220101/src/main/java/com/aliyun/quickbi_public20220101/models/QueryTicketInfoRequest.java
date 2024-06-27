// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryTicketInfoRequest extends TeaModel {
    /**
     * <p>Obtains the details of a specified ticket for a report that is not embedded in the report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a27a9aec-<strong><strong>-</strong></strong>-bd40-1a21ea41d7c5</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static QueryTicketInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketInfoRequest self = new QueryTicketInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketInfoRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
