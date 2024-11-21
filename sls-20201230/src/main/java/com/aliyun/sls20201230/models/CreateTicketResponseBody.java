// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateTicketResponseBody extends TeaModel {
    /**
     * <p>The ticket that is used for logon-free access.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ***************.eyJ******************.KUT****************</p>
     */
    @NameInMap("ticket")
    public String ticket;

    public static CreateTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketResponseBody self = new CreateTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
