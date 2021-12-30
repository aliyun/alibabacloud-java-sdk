// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class EvaluateTicketRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Score")
    public String score;

    @NameInMap("Solved")
    public Boolean solved;

    @NameInMap("TicketId")
    public String ticketId;

    public static EvaluateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        EvaluateTicketRequest self = new EvaluateTicketRequest();
        return TeaModel.build(map, self);
    }

    public EvaluateTicketRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EvaluateTicketRequest setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public EvaluateTicketRequest setSolved(Boolean solved) {
        this.solved = solved;
        return this;
    }
    public Boolean getSolved() {
        return this.solved;
    }

    public EvaluateTicketRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

}
