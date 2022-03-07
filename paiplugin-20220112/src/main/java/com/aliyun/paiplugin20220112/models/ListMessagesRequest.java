// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessagesRequest extends TeaModel {
    // 发送日期，格式为20220101。
    @NameInMap("Datetime")
    public String datetime;

    // 关联人群Id过滤。
    @NameInMap("GroupId")
    public String groupId;

    // 短信Id过滤，短信Id为SendMessage成功返回的Id。
    @NameInMap("MessageId")
    public String messageId;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 手机号码过滤。
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    // 短信批处理Id过滤，短信批处理Id为SendMessage成功返回的RequestId。
    @NameInMap("RequestId")
    public String requestId;

    // 关联触达计划Id过滤。
    @NameInMap("ScheduleId")
    public String scheduleId;

    // 签名名称过滤。
    @NameInMap("Signature")
    public String signature;

    // 签名Id过滤，同时只能指定签名名称或签名Id其中之一。
    @NameInMap("SignatureId")
    public String signatureId;

    // 短信发送状态过滤。
    // - 0 : 发送中。
    // - 1 : 发送成功。
    // - 2 : 发送失败。
    @NameInMap("Status")
    public Integer status;

    // 模板号过滤。
    @NameInMap("TemplateCode")
    public String templateCode;

    // 模板Id过滤，同时只能指定模板Code或模板Id其中之一。
    @NameInMap("TemplateId")
    public String templateId;

    // 模板类型过滤。
    // - 0 : 验证码。
    // - 1 : 短信通知。
    // - 2 : 推广短信。
    @NameInMap("TemplateType")
    public Integer templateType;

    public static ListMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesRequest self = new ListMessagesRequest();
        return TeaModel.build(map, self);
    }

    public ListMessagesRequest setDatetime(String datetime) {
        this.datetime = datetime;
        return this;
    }
    public String getDatetime() {
        return this.datetime;
    }

    public ListMessagesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListMessagesRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ListMessagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessagesRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ListMessagesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessagesRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ListMessagesRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ListMessagesRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public ListMessagesRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListMessagesRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ListMessagesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListMessagesRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
