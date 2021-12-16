// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateTicketWithBizDataRequest extends TeaModel {
    @NameInMap("BizData")
    public String bizData;

    @NameInMap("CarbonCopy")
    public String carbonCopy;

    @NameInMap("CategoryId")
    public Long categoryId;

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

    public static CreateTicketWithBizDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithBizDataRequest self = new CreateTicketWithBizDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithBizDataRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

    public CreateTicketWithBizDataRequest setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
        return this;
    }
    public String getCarbonCopy() {
        return this.carbonCopy;
    }

    public CreateTicketWithBizDataRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketWithBizDataRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTicketWithBizDataRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketWithBizDataRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public CreateTicketWithBizDataRequest setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public Integer getCreatorType() {
        return this.creatorType;
    }

    public CreateTicketWithBizDataRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public CreateTicketWithBizDataRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public CreateTicketWithBizDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTicketWithBizDataRequest setMemberId(Long memberId) {
        this.memberId = memberId;
        return this;
    }
    public Long getMemberId() {
        return this.memberId;
    }

    public CreateTicketWithBizDataRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public CreateTicketWithBizDataRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTicketWithBizDataRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
