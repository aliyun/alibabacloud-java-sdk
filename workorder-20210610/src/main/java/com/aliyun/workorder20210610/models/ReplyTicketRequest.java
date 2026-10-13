// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketRequest extends TeaModel {
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
    public java.util.List<String> fileNameList;

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

    public static ReplyTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyTicketRequest self = new ReplyTicketRequest();
        return TeaModel.build(map, self);
    }

    public ReplyTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplyTicketRequest setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }
    public Boolean getEncrypt() {
        return this.encrypt;
    }

    public ReplyTicketRequest setFileNameList(java.util.List<String> fileNameList) {
        this.fileNameList = fileNameList;
        return this;
    }
    public java.util.List<String> getFileNameList() {
        return this.fileNameList;
    }

    public ReplyTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ReplyTicketRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
