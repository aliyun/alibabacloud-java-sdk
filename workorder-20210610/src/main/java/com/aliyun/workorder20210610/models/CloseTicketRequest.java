// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class CloseTicketRequest extends TeaModel {
    @NameInMap("TicketId")
    public String ticketId;

    public static CloseTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseTicketRequest self = new CloseTicketRequest();
        return TeaModel.build(map, self);
    }

    public CloseTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
