// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckItemWarningSummaryRequest extends TeaModel {
    /**
     * <p>The name of the check item. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>password</p>
     */
    @NameInMap("CheckItemFuzzy")
    public String checkItemFuzzy;

    /**
     * <p>The risk level. Default value: null, which indicates that check items at all risk levels are queried.Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>medium</p>
     */
    @NameInMap("CheckLevel")
    public String checkLevel;

    /**
     * <p>The type of the check item.</p>
     * 
     * <strong>example:</strong>
     * <p>hc.check.type.attack_defense</p>
     */
    @NameInMap("CheckType")
    public String checkType;

    /**
     * <p>The risk status. Default value is null, meaning check items in all states are queried. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: failed</li>
     * <li><strong>3</strong>: passed</li>
     * <li><strong>6</strong>: whitelisted</li>
     * <li><strong>8</strong>: fixed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("CheckWarningStatus")
    public Integer checkWarningStatus;

    /**
     * <p>The list of risk levels. If the CheckWarningStatus parameter is specified, only it takes effect.</p>
     */
    @NameInMap("CheckWarningStatusList")
    public java.util.List<Integer> checkWarningStatusList;

    /**
     * <p>The name of the field that is used to query containers.</p>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the field that is used to query containers.</p>
     * 
     * <strong>example:</strong>
     * <p>c471f0f61b9c04f8380556e922cf1****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the asset group.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
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
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
     * <blockquote>
     * <p>We recommend that you do not leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain the IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The type of the baseline.</p>
     * 
     * <strong>example:</strong>
     * <p>weak_password</p>
     */
    @NameInMap("RiskType")
    public String riskType;

    /**
     * <p>The data source. Default value: <strong>default</strong>. Valid value:</p>
     * <ul>
     * <li><strong>agentless</strong>: The check items of baselines for agentless detection.</li>
     * <li><strong>default</strong>: The check items of baselines for hosts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Start of time range for filtering alerts, effective only for querying historically handled alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>1732793158366</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The UUIDs of the servers.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of the servers.</p>
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
