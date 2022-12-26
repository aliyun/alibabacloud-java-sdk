// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryRequest extends TeaModel {
    @NameInMap("CheckItemFuzzy")
    public String checkItemFuzzy;

    @NameInMap("CheckLevel")
    public String checkLevel;

    @NameInMap("CheckType")
    public String checkType;

    @NameInMap("CheckWarningStatus")
    public Integer checkWarningStatus;

    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RiskType")
    public String riskType;

    public static ListCheckItemWarningSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckItemWarningSummaryRequest self = new ListCheckItemWarningSummaryRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckItemWarningSummaryRequest setCheckItemFuzzy(String checkItemFuzzy) {
        this.checkItemFuzzy = checkItemFuzzy;
        return this;
    }
    public String getCheckItemFuzzy() {
        return this.checkItemFuzzy;
    }

    public ListCheckItemWarningSummaryRequest setCheckLevel(String checkLevel) {
        this.checkLevel = checkLevel;
        return this;
    }
    public String getCheckLevel() {
        return this.checkLevel;
    }

    public ListCheckItemWarningSummaryRequest setCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }
    public String getCheckType() {
        return this.checkType;
    }

    public ListCheckItemWarningSummaryRequest setCheckWarningStatus(Integer checkWarningStatus) {
        this.checkWarningStatus = checkWarningStatus;
        return this;
    }
    public Integer getCheckWarningStatus() {
        return this.checkWarningStatus;
    }

    public ListCheckItemWarningSummaryRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public ListCheckItemWarningSummaryRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public ListCheckItemWarningSummaryRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCheckItemWarningSummaryRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ListCheckItemWarningSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListCheckItemWarningSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckItemWarningSummaryRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

}
