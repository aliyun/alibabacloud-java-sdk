// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteMaliciousNoteRequest extends TeaModel {
    /**
     * <p>The ID of the remarks.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListAgentlessMaliciousFiles~~">ListAgentlessMaliciousFiles</a> operation to obtain the ID from the NoteId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NoteId")
    public Long noteId;

    public static DeleteMaliciousNoteRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMaliciousNoteRequest self = new DeleteMaliciousNoteRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMaliciousNoteRequest setNoteId(Long noteId) {
        this.noteId = noteId;
        return this;
    }
    public Long getNoteId() {
        return this.noteId;
    }

}
