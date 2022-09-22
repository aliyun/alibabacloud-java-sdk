// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class UpdateTicketAllRequest extends TeaModel {
    @NameInMap("BuId")
    public Long buId;

    @NameInMap("CaseId")
    public Long caseId;

    @NameInMap("CaseType")
    public Integer caseType;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Cc")
    public String cc;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelType")
    public Integer channelType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("CreatorType")
    public Integer creatorType;

    @NameInMap("DepartmentId")
    public Long departmentId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ExtAttr")
    public String extAttr;

    @NameInMap("Feedback")
    public String feedback;

    @NameInMap("FromInfo")
    public String fromInfo;

    @NameInMap("Header")
    public UpdateTicketAllRequestHeader header;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("MemberType")
    public Integer memberType;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("OtherFields")
    public java.util.Map<String, ?> otherFields;

    @NameInMap("ParentCaseId")
    public Long parentCaseId;

    @NameInMap("PlanEndTime")
    public String planEndTime;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("RefCaseId")
    public Long refCaseId;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TouchId")
    public Long touchId;

    public static UpdateTicketAllRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketAllRequest self = new UpdateTicketAllRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTicketAllRequest setBuId(Long buId) {
        this.buId = buId;
        return this;
    }
    public Long getBuId() {
        return this.buId;
    }

    public UpdateTicketAllRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public UpdateTicketAllRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public UpdateTicketAllRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public UpdateTicketAllRequest setCc(String cc) {
        this.cc = cc;
        return this;
    }
    public String getCc() {
        return this.cc;
    }

    public UpdateTicketAllRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateTicketAllRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public UpdateTicketAllRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTicketAllRequest setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateTicketAllRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public UpdateTicketAllRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public UpdateTicketAllRequest setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public Integer getCreatorType() {
        return this.creatorType;
    }

    public UpdateTicketAllRequest setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public Long getDepartmentId() {
        return this.departmentId;
    }

    public UpdateTicketAllRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateTicketAllRequest setExtAttr(String extAttr) {
        this.extAttr = extAttr;
        return this;
    }
    public String getExtAttr() {
        return this.extAttr;
    }

    public UpdateTicketAllRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateTicketAllRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public UpdateTicketAllRequest setHeader(UpdateTicketAllRequestHeader header) {
        this.header = header;
        return this;
    }
    public UpdateTicketAllRequestHeader getHeader() {
        return this.header;
    }

    public UpdateTicketAllRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTicketAllRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public UpdateTicketAllRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public UpdateTicketAllRequest setMemberType(Integer memberType) {
        this.memberType = memberType;
        return this;
    }
    public Integer getMemberType() {
        return this.memberType;
    }

    public UpdateTicketAllRequest setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public UpdateTicketAllRequest setOtherFields(java.util.Map<String, ?> otherFields) {
        this.otherFields = otherFields;
        return this;
    }
    public java.util.Map<String, ?> getOtherFields() {
        return this.otherFields;
    }

    public UpdateTicketAllRequest setParentCaseId(Long parentCaseId) {
        this.parentCaseId = parentCaseId;
        return this;
    }
    public Long getParentCaseId() {
        return this.parentCaseId;
    }

    public UpdateTicketAllRequest setPlanEndTime(String planEndTime) {
        this.planEndTime = planEndTime;
        return this;
    }
    public String getPlanEndTime() {
        return this.planEndTime;
    }

    public UpdateTicketAllRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateTicketAllRequest setRefCaseId(Long refCaseId) {
        this.refCaseId = refCaseId;
        return this;
    }
    public Long getRefCaseId() {
        return this.refCaseId;
    }

    public UpdateTicketAllRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public UpdateTicketAllRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public UpdateTicketAllRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateTicketAllRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

    public static class UpdateTicketAllRequestHeader extends TeaModel {
        @NameInMap("StateVersion")
        public Integer stateVersion;

        @NameInMap("Version")
        public Integer version;

        public static UpdateTicketAllRequestHeader build(java.util.Map<String, ?> map) throws Exception {
            UpdateTicketAllRequestHeader self = new UpdateTicketAllRequestHeader();
            return TeaModel.build(map, self);
        }

        public UpdateTicketAllRequestHeader setStateVersion(Integer stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }
        public Integer getStateVersion() {
            return this.stateVersion;
        }

        public UpdateTicketAllRequestHeader setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
