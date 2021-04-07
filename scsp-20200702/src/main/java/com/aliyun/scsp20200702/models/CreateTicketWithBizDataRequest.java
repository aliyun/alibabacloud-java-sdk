// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateTicketWithBizDataRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public Long templateId;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorType")
    public Integer creatorType;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("MemberId")
    public Long memberId;

    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("FromInfo")
    public String fromInfo;

    @NameInMap("Priority")
    public Integer priority;

    @NameInMap("CarbonCopy")
    public String carbonCopy;

    @NameInMap("FormData")
    public String formData;

    @NameInMap("BizData")
    public String bizData;

    public static CreateTicketWithBizDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithBizDataRequest self = new CreateTicketWithBizDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithBizDataRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTicketWithBizDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTicketWithBizDataRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public CreateTicketWithBizDataRequest setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CreateTicketWithBizDataRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public CreateTicketWithBizDataRequest setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
        return this;
    }
    public Integer getCreatorType() {
        return this.creatorType;
    }

    public CreateTicketWithBizDataRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
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

    public CreateTicketWithBizDataRequest setFromInfo(String fromInfo) {
        this.fromInfo = fromInfo;
        return this;
    }
    public String getFromInfo() {
        return this.fromInfo;
    }

    public CreateTicketWithBizDataRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateTicketWithBizDataRequest setCarbonCopy(String carbonCopy) {
        this.carbonCopy = carbonCopy;
        return this;
    }
    public String getCarbonCopy() {
        return this.carbonCopy;
    }

    public CreateTicketWithBizDataRequest setFormData(String formData) {
        this.formData = formData;
        return this;
    }
    public String getFormData() {
        return this.formData;
    }

    public CreateTicketWithBizDataRequest setBizData(String bizData) {
        this.bizData = bizData;
        return this;
    }
    public String getBizData() {
        return this.bizData;
    }

}
