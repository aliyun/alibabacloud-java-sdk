// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    // 人群ID，用于关联人群。
    @NameInMap("GroupId")
    public String groupId;

    // 外部拓展字段。
    @NameInMap("OutIds")
    public java.util.List<String> outIds;

    // 手机号，每个手机号对应一个模板变量、上行拓展码和外部拓展字段。
    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

    // 发送计划ID，用于关联发送计划。
    @NameInMap("ScheduleId")
    public String scheduleId;

    // 签名名称。
    @NameInMap("SignName")
    public String signName;

    // 签名ID，同时只能指定签名名称或签名ID其中之一。
    @NameInMap("SignatureId")
    public String signatureId;

    // 短信上行拓展码。
    @NameInMap("SmsUpExtendCodes")
    public java.util.List<String> smsUpExtendCodes;

    // 模板Code。
    @NameInMap("TemplateCode")
    public String templateCode;

    // 模板ID，同时只能指定模板Code或模板ID其中之一。
    @NameInMap("TemplateId")
    public String templateId;

    // 短信模板变量对应的实际值，JSON格式。支持传入多个参数，示例：{"name":"张三","number":"15038****76"}。
    @NameInMap("TemplateParams")
    public java.util.List<String> templateParams;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageRequest setOutIds(java.util.List<String> outIds) {
        this.outIds = outIds;
        return this;
    }
    public java.util.List<String> getOutIds() {
        return this.outIds;
    }

    public SendMessageRequest setPhoneNumbers(java.util.List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public java.util.List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public SendMessageRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public SendMessageRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public SendMessageRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public SendMessageRequest setSmsUpExtendCodes(java.util.List<String> smsUpExtendCodes) {
        this.smsUpExtendCodes = smsUpExtendCodes;
        return this;
    }
    public java.util.List<String> getSmsUpExtendCodes() {
        return this.smsUpExtendCodes;
    }

    public SendMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendMessageRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public SendMessageRequest setTemplateParams(java.util.List<String> templateParams) {
        this.templateParams = templateParams;
        return this;
    }
    public java.util.List<String> getTemplateParams() {
        return this.templateParams;
    }

}
