// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ReplyTicketRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("Content")
    public String content;

    @NameInMap("SecretContent")
    public String secretContent;

    public static ReplyTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        ReplyTicketRequest self = new ReplyTicketRequest();
        return TeaModel.build(map, self);
    }

    public ReplyTicketRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ReplyTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ReplyTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ReplyTicketRequest setSecretContent(String secretContent) {
        this.secretContent = secretContent;
        return this;
    }
    public String getSecretContent() {
        return this.secretContent;
    }

}
