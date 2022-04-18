// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReopenTicketRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("TicketId")
    public String ticketId;

    public static ReopenTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReopenTicketRequest self = new ReopenTicketRequest();
        return TeaModel.build(map, self);
    }

    public ReopenTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReopenTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
