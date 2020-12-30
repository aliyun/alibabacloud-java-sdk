// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListTicketNotesRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("TicketId")
    public String ticketId;

    public static ListTicketNotesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketNotesRequest self = new ListTicketNotesRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketNotesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListTicketNotesRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
