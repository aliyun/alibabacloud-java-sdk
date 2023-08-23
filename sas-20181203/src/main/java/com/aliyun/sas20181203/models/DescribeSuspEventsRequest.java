// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <p>The ID of the alert event.</p>
     * <br>
     * <p>> To query the details of an alert event, you must specify the ID of the alert event. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the IDs of alert events.</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The types of the assets.</p>
     */
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    /**
     * <p>The ID of the cluster of whose alert events you want to query.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
     * <br>
     * <p>*   **instanceId**: the ID of the asset</p>
     * <p>*   **appName**: the name of the application</p>
     * <p>*   **clusterId**: the ID of the cluster</p>
     * <p>*   **regionId**: the ID of the region</p>
     * <p>*   **nodeName**: the name of the node</p>
     * <p>*   **namespace**: the namespace</p>
     * <p>*   **clusterName**: the name of the cluster</p>
     * <p>*   **image**: the name of the image</p>
     * <p>*   **imageRepoName**: the name of the image repository</p>
     * <p>*   **imageRepoNamespace**: the namespace to which the image repository belongs</p>
     * <p>*   **imageRepoTag**: the tag that is added to the image</p>
     * <p>*   **imageDigest**: the digest of the image</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query alert events on containers.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies whether the alert event is handled. Valid values:</p>
     * <br>
     * <p>*   **N**: unhandled</p>
     * <p>*   **Y**: handled</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The subtype of the alert event. Separate multiple subtypes with commas (,).</p>
     */
    @NameInMap("EventNames")
    public String eventNames;

    /**
     * <p>The data source of the alert event. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group to which the affected asset belongs.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the alert event.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity of the alert event. Separate multiple severities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **serious**</p>
     * <p>*   **suspicious**</p>
     * <p>*   **remind**</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The name of the asset that is affected by the alert event.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>An array that consists of the handling result codes of alert events.</p>
     */
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The timestamp when the handling operation ends.</p>
     */
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    /**
     * <p>The timestamp when the handling operation starts.</p>
     */
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    /**
     * <p>The number of entries to return on each page. Default value: **20**. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The alert type of the alert event. Valid values:</p>
     * <br>
     * <p>*   **Suspicious process**</p>
     * <p>*   **Webshell**</p>
     * <p>*   **Unusual logon**</p>
     * <p>*   **Exception**</p>
     * <p>*   **Sensitive file tampering**</p>
     * <p>*   **Malicious process (cloud threat detection)**</p>
     * <p>*   **Suspicious network connection**</p>
     * <p>*   **Suspicious account**</p>
     * <p>*   **Application intrusion event**</p>
     * <p>*   **Cloud threat detection**</p>
     * <p>*   **Precise defense**</p>
     * <p>*   **Application whitelist**</p>
     * <p>*   **Persistent webshell**</p>
     * <p>*   **Web application threat detection**</p>
     * <p>*   **Malicious script**</p>
     * <p>*   **Threat intelligence**</p>
     * <p>*   **Malicious network activity**</p>
     * <p>*   **Cluster exception**</p>
     * <p>*   **Webshell (on-premises threat detection)**</p>
     * <p>*   **Vulnerability exploitation**</p>
     * <p>*   **Malicious process (on-premises threat detection)**</p>
     * <p>*   **Trusted exception**</p>
     * <p>*   **Operations to manage other resources**</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The name of the alert or the information about the asset.</p>
     * <br>
     * <p>>  Fuzzy search is supported. The asset information includes the name, public IP address, and private IP address of an asset.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to obtain the IDs.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The custom sorting field. Default value: **operateTime**. Valid values:</p>
     * <br>
     * <p>*   **lastTime**: the latest occurrence time.</p>
     * <p>*   **operateTime**: the handling time.</p>
     * <br>
     * <p>>  This parameter takes effect if you set the **Dealed** parameter to Y.</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The custom sorting order. Default value: **desc**. Valid values:</p>
     * <br>
     * <p>*   **asc**: the ascending order</p>
     * <p>*   **desc**: the descending order</p>
     * <br>
     * <p>>  This parameter takes effect if you set the **Dealed** parameter to Y.</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The source of the alert.</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the alert event. Valid values:</p>
     * <br>
     * <p>*   **0**: all</p>
     * <p>*   **1**: pending handling</p>
     * <p>*   **2**: ignored</p>
     * <p>*   **4**: confirmed</p>
     * <p>*   **8**: marked as a false positive</p>
     * <p>*   **16**: being handled</p>
     * <p>*   **32**: handled</p>
     * <p>*   **64**: expired</p>
     * <p>*   **128**: deleted</p>
     * <p>*   **512**: being automatically blocked</p>
     * <p>*   **513**: automatically blocked</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tactic ID of ATT\&CK.</p>
     */
    @NameInMap("TacticId")
    public String tacticId;

    /**
     * <p>The item that is used to search for the container. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the UUID of the server</p>
     * <p>*   **imageUuid**: the UUID of the image</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time when the alert event was last detected.</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time when the alert event was last detected.</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the alert.</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The UUID of the server on which the alert is detected. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsRequest self = new DescribeSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeSuspEventsRequest setAssetsTypeList(java.util.List<String> assetsTypeList) {
        this.assetsTypeList = assetsTypeList;
        return this;
    }
    public java.util.List<String> getAssetsTypeList() {
        return this.assetsTypeList;
    }

    public DescribeSuspEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSuspEventsRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeSuspEventsRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeSuspEventsRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeSuspEventsRequest setEventNames(String eventNames) {
        this.eventNames = eventNames;
        return this;
    }
    public String getEventNames() {
        return this.eventNames;
    }

    public DescribeSuspEventsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeSuspEventsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSuspEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeSuspEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSuspEventsRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
        this.operateErrorCodeList = operateErrorCodeList;
        return this;
    }
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    public DescribeSuspEventsRequest setOperateTimeEnd(String operateTimeEnd) {
        this.operateTimeEnd = operateTimeEnd;
        return this;
    }
    public String getOperateTimeEnd() {
        return this.operateTimeEnd;
    }

    public DescribeSuspEventsRequest setOperateTimeStart(String operateTimeStart) {
        this.operateTimeStart = operateTimeStart;
        return this;
    }
    public String getOperateTimeStart() {
        return this.operateTimeStart;
    }

    public DescribeSuspEventsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsRequest setParentEventTypes(String parentEventTypes) {
        this.parentEventTypes = parentEventTypes;
        return this;
    }
    public String getParentEventTypes() {
        return this.parentEventTypes;
    }

    public DescribeSuspEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeSuspEventsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSuspEventsRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeSuspEventsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeSuspEventsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeSuspEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSuspEventsRequest setTacticId(String tacticId) {
        this.tacticId = tacticId;
        return this;
    }
    public String getTacticId() {
        return this.tacticId;
    }

    public DescribeSuspEventsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeSuspEventsRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeSuspEventsRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

    public DescribeSuspEventsRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeSuspEventsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
