// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketRequest extends TeaModel {
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
    public java.util.List<String> fileNameList;

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
