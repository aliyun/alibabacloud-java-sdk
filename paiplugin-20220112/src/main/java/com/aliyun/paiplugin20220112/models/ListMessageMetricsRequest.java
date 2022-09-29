// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScheduleId")
    public String scheduleId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("SignatureId")
    public String signatureId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TemplateCode")
    public String templateCode;

    @NameInMap("TemplateId")
    public String templateId;

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
