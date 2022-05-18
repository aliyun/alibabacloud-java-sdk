// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateTicketWithStatusRequest extends TeaModel {
    @NameInMap("CarbonCopy")
    public String carbonCopy;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("CreatorType")
    public Integer creatorType;

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

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("TouchId")
    public String touchId;

    @NameInMap("status")
    public Integer status;

    public static CreateTicketWithStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithStatusRequest self = new CreateTicketWithStatusRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithStatusRequest setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
        return this;
    }
    public String getCarbonCopy() {
        return this.carbonCopy;
    }

    public CreateTicketWithStatusRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketWithStatusRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public CreateTicketWithStatusRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public CreateTicketWithStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTicketWithStatusRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketWithStatusRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public CreateTicketWithStatusRequest setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public Integer getCreatorType() {
        return this.creatorType;
    }

    public CreateTicketWithStatusRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public CreateTicketWithStatusRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public CreateTicketWithStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTicketWithStatusRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateTicketWithStatusRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateTicketWithStatusRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTicketWithStatusRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateTicketWithStatusRequest setTouchId(String touchId) {
        this.touchId = touchId;
        return this;
    }
    public String getTouchId() {
        return this.touchId;
    }

    public CreateTicketWithStatusRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
