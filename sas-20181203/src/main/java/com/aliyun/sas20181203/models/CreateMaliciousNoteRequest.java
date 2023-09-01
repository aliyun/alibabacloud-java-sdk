// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousNoteRequest extends TeaModel {
    @NameInMap("EventId")
    public Long eventId;

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
