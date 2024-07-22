// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582103260434</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <strong>example:</strong>
     * <p>138106*****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <strong>example:</strong>
     * <p>2d5aa451-661f-4f08-b0c4-28eec78decc4</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("EffectiveAnswerCount")
    public Integer effectiveAnswerCount;

    /**
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ABABCBAC</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TransferredToAgent")
    public Boolean transferredToAgent;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("UserUtteranceCount")
    public Integer userUtteranceCount;

    public static DescribeConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationResponseBody self = new DescribeConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConversationResponseBody setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeConversationResponseBody setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public DescribeConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DescribeConversationResponseBody setEffectiveAnswerCount(Integer effectiveAnswerCount) {
        this.effectiveAnswerCount = effectiveAnswerCount;
        return this;
    }
    public Integer getEffectiveAnswerCount() {
        return this.effectiveAnswerCount;
    }

    public DescribeConversationResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeConversationResponseBody setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public DescribeConversationResponseBody setTransferredToAgent(Boolean transferredToAgent) {
        this.transferredToAgent = transferredToAgent;
        return this;
    }
    public Boolean getTransferredToAgent() {
        return this.transferredToAgent;
    }

    public DescribeConversationResponseBody setUserUtteranceCount(Integer userUtteranceCount) {
        this.userUtteranceCount = userUtteranceCount;
        return this;
    }
    public Integer getUserUtteranceCount() {
        return this.userUtteranceCount;
    }

}
