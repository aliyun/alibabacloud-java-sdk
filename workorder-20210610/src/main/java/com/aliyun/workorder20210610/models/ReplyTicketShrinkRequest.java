// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketShrinkRequest extends TeaModel {
    /**
     * <p>The content of the reply to the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OK, the renewal was successful on my end.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Specifies whether to encrypt the content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Encrypt")
    public Boolean encrypt;

    /**
     * <p>A list of attachment names. This is the ObjectKey field returned by the GetAttachmentUploadUrl operation.</p>
     */
    @NameInMap("FileNameList")
    public String fileNameListShrink;

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
     * <p>The Alibaba Cloud account ID (UID).</p>
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
