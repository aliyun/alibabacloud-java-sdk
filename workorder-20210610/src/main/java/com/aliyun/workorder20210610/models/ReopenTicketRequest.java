// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReopenTicketRequest extends TeaModel {
    /**
     * <p>The content of the reply to reopen the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The issue has not been resolved yet.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0005PYGCW</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>The UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1013872004421947</p>
     */
    @NameInMap("Uid")
    public String uid;

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

    public ReopenTicketRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
