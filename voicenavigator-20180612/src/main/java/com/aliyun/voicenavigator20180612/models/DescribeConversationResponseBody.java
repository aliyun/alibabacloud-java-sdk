// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeConversationResponseBody extends TeaModel {
    @NameInMap("EffectiveAnswerCount")
    public Integer effectiveAnswerCount;

    @NameInMap("ConversationId")
    public String conversationId;

    @NameInMap("TransferredToAgent")
    public Boolean transferredToAgent;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("UserUtteranceCount")
    public Integer userUtteranceCount;

    public static DescribeConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConversationResponseBody self = new DescribeConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConversationResponseBody setEffectiveAnswerCount(Integer effectiveAnswerCount) {
        this.effectiveAnswerCount = effectiveAnswerCount;
        return this;
    }
    public Integer getEffectiveAnswerCount() {
        return this.effectiveAnswerCount;
    }

    public DescribeConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public DescribeConversationResponseBody setTransferredToAgent(Boolean transferredToAgent) {
        this.transferredToAgent = transferredToAgent;
        return this;
    }
    public Boolean getTransferredToAgent() {
        return this.transferredToAgent;
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

    public DescribeConversationResponseBody setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public DescribeConversationResponseBody setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public DescribeConversationResponseBody setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public DescribeConversationResponseBody setUserUtteranceCount(Integer userUtteranceCount) {
        this.userUtteranceCount = userUtteranceCount;
        return this;
    }
    public Integer getUserUtteranceCount() {
        return this.userUtteranceCount;
    }

}
