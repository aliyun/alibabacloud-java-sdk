// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SendDigitalSmsRequest extends TeaModel {
    // 外部流水拓展字段
    @NameInMap("OutId")
    public String outId;

    // 短信任务名称
    @NameInMap("TaskName")
    public String taskName;

    // 平台ID
    @NameInMap("PlatformId")
    public String platformId;

    // 发送手机号
    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    // 任务类型
    @NameInMap("ChannelType")
    public Long channelType;

    // 短信模板ID
    @NameInMap("SmsTemplateId")
    public String smsTemplateId;

    // OEM code
    @NameInMap("AccessId")
    public String accessId;

    // 组织ID
    @NameInMap("TenantId")
    public String tenantId;

    // 空间ID
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SendDigitalSmsRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDigitalSmsRequest self = new SendDigitalSmsRequest();
        return TeaModel.build(map, self);
    }

    public SendDigitalSmsRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public SendDigitalSmsRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public SendDigitalSmsRequest setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public SendDigitalSmsRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendDigitalSmsRequest setChannelType(Long channelType) {
        this.channelType = channelType;
        return this;
    }
    public Long getChannelType() {
        return this.channelType;
    }

    public SendDigitalSmsRequest setSmsTemplateId(String smsTemplateId) {
        this.smsTemplateId = smsTemplateId;
        return this;
    }
    public String getSmsTemplateId() {
        return this.smsTemplateId;
    }

    public SendDigitalSmsRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public SendDigitalSmsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SendDigitalSmsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
