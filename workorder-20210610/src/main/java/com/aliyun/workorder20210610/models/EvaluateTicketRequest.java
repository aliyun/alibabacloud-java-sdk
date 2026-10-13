// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class EvaluateTicketRequest extends TeaModel {
    /**
     * <p>The content of the evaluation.</p>
     * 
     * <strong>example:</strong>
     * <p>Very satisfactory support experience</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The rating, from 1 to 5 stars.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Score")
    public String score;

    /**
     * <p>Indicates whether the issue was resolved.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Solved")
    public Boolean solved;

    /**
     * <p>The ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>001ET1BU1P</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    /**
     * <p>The UID.</p>
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
