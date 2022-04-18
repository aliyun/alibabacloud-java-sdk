// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ReplyTicketShrinkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Encrypt")
    public Boolean encrypt;

    @NameInMap("FileNameList")
    public String fileNameListShrink;

    @NameInMap("TicketId")
    public String ticketId;

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

}
