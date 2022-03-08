// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsRequest extends TeaModel {
    // 结束日期，必填，格式20220102。
    @NameInMap("EndDate")
    public String endDate;

    // 关联人群Id。
    @NameInMap("GroupId")
    public String groupId;

    // 分页数，从1开始，默认为1。
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 分页大小，默认为10。
    @NameInMap("PageSize")
    public Integer pageSize;

    // 关联触达计划Id。
    @NameInMap("ScheduleId")
    public String scheduleId;

    // 签名名称。
    @NameInMap("Signature")
    public String signature;

    // 签名Id，同时只能指定签名名称或签名Id其中之一。
    @NameInMap("SignatureId")
    public String signatureId;

    // 开始日期，必填，格式20220102。
    @NameInMap("StartDate")
    public String startDate;

    // 模板号。
    @NameInMap("TemplateCode")
    public String templateCode;

    // 模板Id，同时只能指定模板Code或模板Id其中之一。
    @NameInMap("TemplateId")
    public String templateId;

    // 模板类型。
    // 0 : 验证码。
    // 1 : 短信通知。
    // 2 : 推广短信。
    @NameInMap("TemplateType")
    public Integer templateType;

    public static ListMessageMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMessageMetricsRequest self = new ListMessageMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListMessageMetricsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListMessageMetricsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListMessageMetricsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMessageMetricsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMessageMetricsRequest setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
        return this;
    }
    public String getScheduleId() {
        return this.scheduleId;
    }

    public ListMessageMetricsRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public ListMessageMetricsRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public ListMessageMetricsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListMessageMetricsRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ListMessageMetricsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ListMessageMetricsRequest setTemplateType(Integer templateType) {
        this.templateType = templateType;
        return this;
    }
    public Integer getTemplateType() {
        return this.templateType;
    }

}
