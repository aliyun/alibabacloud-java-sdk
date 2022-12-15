// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Encrypt")
    public Boolean encrypt;

    @NameInMap("FileNameList")
    public java.util.List<String> fileNameList;

    @NameInMap("TicketId")
    public String ticketId;

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
