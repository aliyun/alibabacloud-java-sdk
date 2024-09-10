// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateSuspEventNoteRequest extends TeaModel {
    /**
     * <p>The ID of the alert event to which you want to add remarks. You can call the <a href="https://help.aliyun.com/document_detail/251497.html">DescribeSuspEvents</a> operation to query the IDs of alert events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>668931</p>
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

    public static CreateSuspEventNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSuspEventNoteRequest self = new CreateSuspEventNoteRequest();
        return TeaModel.build(map, self);
    }

    public CreateSuspEventNoteRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public CreateSuspEventNoteRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
