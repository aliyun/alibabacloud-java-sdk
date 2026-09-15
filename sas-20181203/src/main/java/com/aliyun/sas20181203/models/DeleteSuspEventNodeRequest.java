// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSuspEventNodeRequest extends TeaModel {
    /**
     * <p>The ID of the note.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain this parameter from the EventNotes field.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("NoteId")
    public Long noteId;

    /**
     * <p>The Alibaba Cloud account ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

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

    public DeleteSuspEventNodeRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

}
