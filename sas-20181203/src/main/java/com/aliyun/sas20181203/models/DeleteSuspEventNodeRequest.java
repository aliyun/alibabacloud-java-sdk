// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSuspEventNodeRequest extends TeaModel {
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
