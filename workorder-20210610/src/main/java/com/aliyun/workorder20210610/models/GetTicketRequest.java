// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class GetTicketRequest extends TeaModel {
    @NameInMap("TicketId")
    public String ticketId;

    public static GetTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketRequest self = new GetTicketRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
