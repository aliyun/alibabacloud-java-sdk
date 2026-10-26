// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class RespondAgentConversationActionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;请选择实例地域&quot;:&quot;华东 1（杭州）&quot;}</p>
     */
    @NameInMap("answers")
    public java.util.Map<String, String> answers;

    /**
     * <strong>example:</strong>
     * <p>allow</p>
     */
    @NameInMap("decision")
    public String decision;

    /**
     * <strong>example:</strong>
     * <p>允许执行只读查询</p>
     */
    @NameInMap("note")
    public String note;

    public static RespondAgentConversationActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RespondAgentConversationActionRequest self = new RespondAgentConversationActionRequest();
        return TeaModel.build(map, self);
    }

    public RespondAgentConversationActionRequest setAnswers(java.util.Map<String, String> answers) {
        this.answers = answers;
        return this;
    }
    public java.util.Map<String, String> getAnswers() {
        return this.answers;
    }

    public RespondAgentConversationActionRequest setDecision(String decision) {
        this.decision = decision;
        return this;
    }
    public String getDecision() {
        return this.decision;
    }

    public RespondAgentConversationActionRequest setNote(String note) {
        this.note = note;
        return this;
    }
    public String getNote() {
        return this.note;
    }

}
