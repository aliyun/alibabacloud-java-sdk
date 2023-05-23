// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    /**
     * <p>人群Id，用于关联人群。</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>外部拓展字段，示例：["1234567890"]。</p>
     */
    @NameInMap("OutIds")
    public java.util.List<String> outIds;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>手机号，每个手机号对应一个模板变量、上行拓展码和外部拓展字段，示例：["1234567890"]。</p>
     */
    @NameInMap("PhoneNumbers")
    public java.util.List<String> phoneNumbers;

    /**
     * <p>触达计划Id，用于关联触达计划。</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>签名名称。</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>签名Id，同时只能指定签名名称或签名Id其中之一。</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>短信上行拓展码，示例：["1234567890"]。</p>
     */
    @NameInMap("SmsUpExtendCodes")
    public java.util.List<String> smsUpExtendCodes;

    /**
     * <p>模板Code。</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>模板Id，同时只能指定模板Code或模板Id其中之一。</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>短信模板变量对应的实际值，JSON格式。支持传入多个参数，示例：[{"name":"张三","number":"15038****76"}]。</p>
     */
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

    public SendMessageRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
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
