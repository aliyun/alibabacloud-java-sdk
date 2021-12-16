// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateSubTicketRequest extends TeaModel {
    @NameInMap("AgentId")
    public Long agentId;

    @NameInMap("BizData")
    public String bizData;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("FormData")
    public String formData;

    @NameInMap("FromInfo")
    public String fromInfo;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("ParentCaseId")
    public Long parentCaseId;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TemplateId")
    public Long templateId;

    public static CreateSubTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubTicketRequest self = new CreateSubTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubTicketRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public CreateSubTicketRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public CreateSubTicketRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateSubTicketRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public CreateSubTicketRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public CreateSubTicketRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public CreateSubTicketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateSubTicketRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateSubTicketRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateSubTicketRequest setParentCaseId(Long parentCaseId) {
        this.parentCaseId = parentCaseId;
        return this;
    }
    public Long getParentCaseId() {
        return this.parentCaseId;
    }

    public CreateSubTicketRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateSubTicketRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
