// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketShrinkRequest extends TeaModel {
    /**
     * <p>Content of the ticket reply</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Why ECS backup failed?</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Encryption status</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypt")
    public Boolean encrypt;

    /**
     * <p>The list of attachment names, GetAttachmentUploadUrl the ObjectKey field returned by the interface.</p>
     */
    @NameInMap("FileNameList")
    public String fileNameListShrink;

    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0005PYGCW</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>Alibaba Cloud UID</p>
     * 
     * <strong>example:</strong>
     * <p>1289427240739141</p>
     */
    @NameInMap("Uid")
    public String uid;

    public static ReplyTicketShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyTicketShrinkRequest self = new ReplyTicketShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReplyTicketShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplyTicketShrinkRequest setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }
    public Boolean getEncrypt() {
        return this.encrypt;
    }

    public ReplyTicketShrinkRequest setFileNameListShrink(String fileNameListShrink) {
        this.fileNameListShrink = fileNameListShrink;
        return this;
    }
    public String getFileNameListShrink() {
        return this.fileNameListShrink;
    }

    public ReplyTicketShrinkRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ReplyTicketShrinkRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
