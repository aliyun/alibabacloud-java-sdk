// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class EvaluateTicketRequest extends TeaModel {
    /**
     * <p>Comment</p>
     * 
     * <strong>example:</strong>
     * <p>The engineer solved my issue.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>Rating star 1-5 stars</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Score")
    public String score;

    /**
     * <p>Whether to resolve</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Solved")
    public Boolean solved;

    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>001ET1BU1P</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>UID</p>
     * 
     * <strong>example:</strong>
     * <p>1902070573958003</p>
     */
    @NameInMap("Uid")
    public String uid;

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

    public EvaluateTicketRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
