// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsRequest extends TeaModel {
    /**
     * <p>结束日期，格式20220102。</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>关联人群Id。</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>分页数，从1开始，默认为1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>分页大小，默认为10。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>关联触达计划Id。</p>
     */
    @NameInMap("ScheduleId")
    public String scheduleId;

    /**
     * <p>签名名称。</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>签名Id，同时只能指定签名名称或签名Id其中之一。</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>开始日期，格式20220102。</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>模板号。</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>模板Id，同时只能指定模板Code或模板Id其中之一。</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>模板类型。</p>
     * <p>- 0 : 验证码。</p>
     * <p>- 1 : 短信通知。</p>
     * <p>- 2 : 推广短信。</p>
     */
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
