// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSuspEventNodeRequest extends TeaModel {
    /**
     * <p>The ID of the description.</p>
     * <br>
     * <p>> You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to obtain the ID of the description by using the EventNotes field.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NoteId")
    public Long noteId;

    public static DeleteSuspEventNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSuspEventNodeRequest self = new DeleteSuspEventNodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSuspEventNodeRequest setNoteId(Long noteId) {
        this.noteId = noteId;
        return this;
    }
    public Long getNoteId() {
        return this.noteId;
    }

}
