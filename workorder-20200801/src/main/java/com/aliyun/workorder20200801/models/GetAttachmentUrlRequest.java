// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200801.models;

import com.aliyun.tea.*;

public class GetAttachmentUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AttachName")
    public String attachName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NoteId")
    public String noteId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    public static GetAttachmentUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAttachmentUrlRequest self = new GetAttachmentUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetAttachmentUrlRequest setAttachName(String attachName) {
        this.attachName = attachName;
        return this;
    }
    public String getAttachName() {
        return this.attachName;
    }

    public GetAttachmentUrlRequest setNoteId(String noteId) {
        this.noteId = noteId;
        return this;
    }
    public String getNoteId() {
        return this.noteId;
    }

    public GetAttachmentUrlRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
