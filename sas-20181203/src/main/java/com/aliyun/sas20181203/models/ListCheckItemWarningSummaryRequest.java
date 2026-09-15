// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryRequest extends TeaModel {
    /**
     * <p>The fuzzy match for the check item name.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("CheckItemFuzzy")
    public String checkItemFuzzy;

    /**
     * <p>The risk level. Default value: null, which indicates that all levels are queried. Valid values:</p>
     * <ul>
     * <li><strong>high</strong>: High.</li>
     * <li><strong>medium</strong>: Medium.</li>
     * <li><strong>low</strong>: Low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("CheckLevel")
    public String checkLevel;

    /**
     * <p>The check item category name.</p>
     * 
     * <strong>example:</strong>
     * <p>hc.check.type.attack_defense</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <p>The risk status. Default value: null, which indicates that all statuses are queried. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Failed.</li>
     * <li><strong>3</strong>: Passed.</li>
     * <li><strong>6</strong>: Whitelisted.</li>
     * <li><strong>8</strong>: Fixed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckWarningStatus")
    public Integer checkWarningStatus;

    /**
     * <p>The list of risk statuses. If both this parameter and CheckWarningStatus are specified, only CheckWarningStatus takes effect.</p>
     */
    @NameInMap("CheckWarningStatusList")
    public java.util.List<Integer> checkWarningStatusList;

    /**
     * <p>The container security query parameter name.</p>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The container security query parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>c471f0f61b9c04f8380556e922cf1****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates that query results are displayed starting from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1161****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries per page when paging. Default value: 20. If the PageSize parameter is left empty, 20 entries are returned per page.</p>
     * <blockquote>
     * <p>Do not leave PageSize empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the member accounts in the resource directory (Alibaba Cloud account).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1232428423234****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The baseline category name.</p>
     * 
     * <strong>example:</strong>
     * <p>weak_password</p>
     */
    @NameInMap("RiskType")
    public String riskType;

    /**
     * <p>The data source. Default value: <strong>default</strong>. Valid values:</p>
     * <ul>
     * <li><strong>agentless</strong>: agentless detection.</li>
     * <li><strong>default</strong>: host baseline.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The start time for filtering alerts. This parameter takes effect only when you query historical processed alerts. Specify a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1732793158366</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of server UUIDs to query.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to obtain the UUID of a server.</p>
     * </blockquote>
     */
    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

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

    public ListCheckItemWarningSummaryRequest setCheckWarningStatusList(java.util.List<Integer> checkWarningStatusList) {
        this.checkWarningStatusList = checkWarningStatusList;
        return this;
    }
    public java.util.List<Integer> getCheckWarningStatusList() {
        return this.checkWarningStatusList;
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

    public ListCheckItemWarningSummaryRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ListCheckItemWarningSummaryRequest setRiskType(String riskType) {
        this.riskType = riskType;
        return this;
    }
    public String getRiskType() {
        return this.riskType;
    }

    public ListCheckItemWarningSummaryRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ListCheckItemWarningSummaryRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListCheckItemWarningSummaryRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

}
