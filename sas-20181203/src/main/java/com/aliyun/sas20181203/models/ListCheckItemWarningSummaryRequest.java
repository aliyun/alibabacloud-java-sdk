// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryRequest extends TeaModel {
    /**
     * <p>The name of the check item. Fuzzy match is supported.</p>
     */
    @NameInMap("CheckItemFuzzy")
    public String checkItemFuzzy;

    /**
     * <p>The risk level. Default value: null, which indicates that check items at all risk levels are queried.Valid values:</p>
     * <p>*   **high**</p>
     * <p>*   **medium**</p>
     * <p>*   **low**</p>
     */
    @NameInMap("CheckLevel")
    public String checkLevel;

    /**
     * <p>The type of the check item.</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <p>The risk status. Default value: null, which indicates that check items in all states are queried.Valid values:</p>
     * <p>*   **1**: failed</p>
     * <p>*   **3**: passed</p>
     */
    @NameInMap("CheckWarningStatus")
    public Integer checkWarningStatus;

    /**
     * <p>The name of the field that is used to query containers.</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that is used to query containers.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <br>
     * <p>> We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the baseline.</p>
     */
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
