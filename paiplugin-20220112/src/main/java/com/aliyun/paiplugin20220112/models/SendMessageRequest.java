// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OutIds")
    public java.util.List<String> outIds;

    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("SignName")
    public String signName;

    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("SmsUpExtendCodes")
    public java.util.List<String> smsUpExtendCodes;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateId")
    public String templateId;

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
