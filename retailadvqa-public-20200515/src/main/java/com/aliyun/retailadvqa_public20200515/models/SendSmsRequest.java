// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SendSmsRequest extends TeaModel {
    // 短信任务名称
    @NameInMap("TaskName")
    public String taskName;

    // 外部流水拓展字段
    @NameInMap("OutId")
    public String outId;

    // 签名名称
    @NameInMap("SignName")
    public String signName;

    // 短信模板ID
    @NameInMap("SmsTemplateId")
    public String smsTemplateId;

    // 发送手机号
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    // 平台ID
    @NameInMap("PlatformId")
    public String platformId;

    // 发送渠道
    @NameInMap("ChannelType")
    public Long channelType;

    // 是否为变量短信
    @NameInMap("IsVariable")
    public Long isVariable;

    // 短信模板变量对应的实际值
    @NameInMap("TemplateParam")
    public String templateParam;

    // oem code
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SendSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSmsRequest self = new SendSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendSmsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SendSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendSmsRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendSmsRequest setSmsTemplateId(String smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
        return this;
    }
    public String getSmsTemplateId() {
        return this.smsTemplateId;
    }

    public SendSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendSmsRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SendSmsRequest setChannelType(Long channelType) {
        this.channelType = channelType;
        return this;
    }
    public Long getChannelType() {
        return this.channelType;
    }

    public SendSmsRequest setIsVariable(Long isVariable) {
        this.isVariable = isVariable;
        return this;
    }
    public Long getIsVariable() {
        return this.isVariable;
    }

    public SendSmsRequest setTemplateParam(String templateParam) {
        this.templateParam = templateParam;
        return this;
    }
    public String getTemplateParam() {
        return this.templateParam;
    }

    public SendSmsRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SendSmsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendSmsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
