// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListTicketNotesRequest extends TeaModel {
    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("Uid")
    public String uid;

    public static ListTicketNotesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesRequest self = new ListTicketNotesRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketNotesRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ListTicketNotesRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
