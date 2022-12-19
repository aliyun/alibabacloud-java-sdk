// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    // The ID of the alert event.
    // 
    // >  To query the details about the exceptions of an alert event, you must specify the ID of the alert event. You can call the [DescribeAlarmEventList](~~DescribeAlarmEventList~~) operation to query the IDs of alert events.
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    // The types of assets.
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    // The ID of the cluster of whose alert events you want to query.
    @NameInMap("ClusterId")
    public String clusterId;

    // The key of the condition that is used to query alert events on containers. Valid values:
    // 
    // *   **instanceId**: the ID of the asset
    // *   **appName**: the name of the application
    // *   **clusterId**: the ID of the cluster
    // *   **regionId**: the ID of the region
    // *   **nodeName**: the name of the node
    // *   **namespace**: the namespace
    // *   **clusterName**: the name of the cluster
    // *   **image**: the name of the image
    // *   **imageRepoName**: the name of the image repository
    // *   **imageRepoNamespace**: the namespace to which the image repository belongs
    // *   **imageRepoTag**: the tag that is added to the image
    // *   **imageDigest**: the digest of the image
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    // The value of the condition that is used to query alert events on containers.
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public String currentPage;

    // Specifies whether the alert event is handled. Valid values:
    // 
    // *   **N**: unhandled
    // *   **Y**: handled
    @NameInMap("Dealed")
    public String dealed;

    // The subtype of the alert event. Separate multiple subtypes with commas (,).
    @NameInMap("EventNames")
    public String eventNames;

    // The data source of the alert event. Set the value to sas.
    @NameInMap("From")
    public String from;

    // The ID of the asset group to which the affected asset belongs.
    @NameInMap("GroupId")
    public Long groupId;

    // The ID of the alert event.
    @NameInMap("Id")
    public Long id;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The severity of the alert event. Separate multiple severities with commas (,). Valid values:
    // 
    // *   **serious**
    // *   **suspicious**
    // *   **remind**
    @NameInMap("Levels")
    public String levels;

    // The name of the asset that is affected by the alert event.
    @NameInMap("Name")
    public String name;

    // An array that consists of the handling result codes of alert events.
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    // The timestamp when the handling operation ends.
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    // The timestamp when the handling operation starts.
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public String pageSize;

    // The alert type of the alert event. Valid values:
    // 
    // *   **Suspicious process**
    // *   **Webshell**
    // *   **Unusual logon**
    // *   **Exception**
    // *   **Sensitive file tampering**
    // *   **Malicious process (cloud threat detection)**
    // *   **Suspicious network connection**
    // *   **Suspicious account**
    // *   **Application intrusion event**
    // *   **Cloud threat detection**
    // *   **Precise defense**
    // *   **Application whitelist**
    // *   **Persistent webshell**
    // *   **Web application threat detection**
    // *   **Malicious script**
    // *   **Threat intelligence**
    // *   **Malicious network activity**
    // *   **Cluster exception**
    // *   **Webshell (on-premises threat detection)**
    // *   **Vulnerability exploitation**
    // *   **Malicious process (on-premises threat detection)**
    // *   **Trusted exception**
    // *   **Operations to manage other resources**
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    // The name of the alert or the information about the asset.
    // 
    // >  Fuzzy search is supported. The asset information includes the name, public IP address, and private IP address of an asset.
    @NameInMap("Remark")
    public String remark;

    // The custom sorting field. Default value: **operateTime**. Valid values:
    // 
    // *   **lastTime**: the latest occurrence time.
    // *   **operateTime**: the handling time.
    // 
    // >  This parameter takes effect if you set the **Dealed** parameter to Y.
    @NameInMap("SortColumn")
    public String sortColumn;

    // The custom sorting order. Default value: **desc**. Valid values:
    // 
    // *   **asc**: the ascending order
    // *   **desc**: the descending order
    // 
    // >  This parameter takes effect if you set the **Dealed** parameter to Y.
    @NameInMap("SortType")
    public String sortType;

    // The source of the alert.
    @NameInMap("Source")
    public String source;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The status of the alert event. Valid values:
    // 
    // *   **0**: all
    // *   **1**: pending handling
    // *   **2**: ignored
    // *   **4**: confirmed
    // *   **8**: marked as a false positive
    // *   **16**: being handled
    // *   **32**: handled
    // *   **64**: expired
    // *   **128**: deleted
    // *   **512**: being automatically blocked
    // *   **513**: automatically blocked
    @NameInMap("Status")
    public String status;

    // The tactic ID of ATT\&CK.
    @NameInMap("TacticId")
    public String tacticId;

    // The item that is used to search for the container. Valid values:
    // 
    // *   **containerId**: the ID of the container
    // *   **uuid**: the UUID of the server
    // *   **imageUuid**: the UUID of the image
    @NameInMap("TargetType")
    public String targetType;

    // The end time when the alert event was last detected.
    @NameInMap("TimeEnd")
    public String timeEnd;

    // The start time when the alert event was last detected.
    @NameInMap("TimeStart")
    public String timeStart;

    // The unique key of the alert.
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    // The UUID of the server on which the alert is detected. Separate multiple UUIDs with commas (,).
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
