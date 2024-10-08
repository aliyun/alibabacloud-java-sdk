// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousNoteRequest extends TeaModel {
    /**
     * <p>The ID of the alert event to which you want to add remarks.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> operation to obtain the ID of the alert event from the NoteId parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80****</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The remarks that you want to add.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Ignore</p>
     */
    @NameInMap("Note")
    public String note;

    public static CreateMaliciousNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMaliciousNoteRequest self = new CreateMaliciousNoteRequest();
        return TeaModel.build(map, self);
    }

    public CreateMaliciousNoteRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public CreateMaliciousNoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
