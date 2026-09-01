// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <p>The unique ID of the alert event.</p>
     * <blockquote>
     * <p>To query the exception information of a single alert event, provide the unique ID of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8df914418f4211fb****</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The collection of asset types.</p>
     */
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    /**
     * <p>The ID of the cluster for which you want to query alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The container search field. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: instance ID</li>
     * <li><strong>appName</strong>: application name</li>
     * <li><strong>clusterId</strong>: cluster ID</li>
     * <li><strong>regionId</strong>: region</li>
     * <li><strong>nodeName</strong>: node name</li>
     * <li><strong>namespace</strong>: namespace</li>
     * <li><strong>clusterName</strong>: cluster name</li>
     * <li><strong>image</strong>: image name</li>
     * <li><strong>imageRepoName</strong>: image repository name</li>
     * <li><strong>imageRepoNamespace</strong>: image repository namespace</li>
     * <li><strong>imageRepoTag</strong>: image tag</li>
     * <li><strong>imageDigest</strong>: image digest</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container search field.</p>
     * 
     * <strong>example:</strong>
     * <p>ccf9769c22b844ff9b8d57417683b****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The page number of the results to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies whether the alert events to query have been handled. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The discovery source. This parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>linux</p>
     */
    @NameInMap("DetectSource")
    public String detectSource;

    /**
     * <p>The subtypes of the alert events. Separate multiple subtypes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("EventNames")
    public String eventNames;

    /**
     * <p>The data source identifier of the alert event. The value is fixed as sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The group ID of the asset affected by the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>18768</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The unique ID that identifies the alert event record.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The severity levels of the security alerts that you want to query. Separate multiple severity levels with commas (,). The severity levels are listed in descending order. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: Critical.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>remind</strong>: Informational.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The multi-account query type. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Queries data of the current account.</li>
     * <li><strong>1</strong>: Queries data of all accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiAccountActionType")
    public Integer multiAccountActionType;

    /**
     * <p>The name of the asset affected by the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-xxx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The collection of alert event handling result codes.</p>
     */
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The end timestamp of the handling time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    /**
     * <p>The start timestamp of the handling time.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    /**
     * <p>The number of alert events to display on each page in a paged query. Default value: <strong>20</strong>. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alarm Metric of the alerting events to query. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>other</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The alert name or asset information to query.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The China site (Chinese mainland) account ID of the member account in the resource directory.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The custom sort field. Default value: <strong>operateTime</strong>. Valid values:</p>
     * <ul>
     * <li><strong>lastTime</strong>: the most recent occurrence time.</li>
     * <li><strong>operateTime</strong>: the processing time.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only when <strong>Dealed</strong> is set to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>operateTime</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The custom sort type. Default value: <strong>desc</strong>. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: ascending order.</li>
     * <li><strong>desc</strong>: descending order.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter takes effect only when <strong>Dealed</strong> is set to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The alert source.</p>
     * 
     * <strong>example:</strong>
     * <p>aegis_suspicious_file_v2</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The list of Alibaba Cloud account IDs that generated the alerts.</p>
     */
    @NameInMap("SourceAliUids")
    public java.util.List<Long> sourceAliUids;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the alert events to query. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether the alert is identified in strict mode.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StrictMode")
    public String strictMode;

    /**
     * <p>The list of operation types supported by the alert.</p>
     */
    @NameInMap("SupportOperateCodeList")
    public java.util.List<String> supportOperateCodeList;

    /**
     * <p>The tactic ID in ATT&amp;CK.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0001</p>
     */
    @NameInMap("TacticId")
    public String tacticId;

    /**
     * <p>The type of the container search target. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: container ID.</li>
     * <li><strong>uuid</strong>: server UUID.</li>
     * <li><strong>imageUuid</strong>: image UUID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time of the latest occurrence time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time of the latest occurrence time range.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the security alert.</p>
     * 
     * <strong>example:</strong>
     * <p>73fc06fb175a7405697e402f52864****</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The UUIDs of the servers for which you want to query alerts. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>bb5d2484-f10e-450d-8917-3e79667e****,0e7c2fcd-7100-42c7-a21a-db6e4f32****</p>
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

    public DescribeSuspEventsRequest setDetectSource(String detectSource) {
        this.detectSource = detectSource;
        return this;
    }
    public String getDetectSource() {
        return this.detectSource;
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

    public DescribeSuspEventsRequest setMultiAccountActionType(Integer multiAccountActionType) {
        this.multiAccountActionType = multiAccountActionType;
        return this;
    }
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
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

    public DescribeSuspEventsRequest setSourceAliUids(java.util.List<Long> sourceAliUids) {
        this.sourceAliUids = sourceAliUids;
        return this;
    }
    public java.util.List<Long> getSourceAliUids() {
        return this.sourceAliUids;
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

    public DescribeSuspEventsRequest setStrictMode(String strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public String getStrictMode() {
        return this.strictMode;
    }

    public DescribeSuspEventsRequest setSupportOperateCodeList(java.util.List<String> supportOperateCodeList) {
        this.supportOperateCodeList = supportOperateCodeList;
        return this;
    }
    public java.util.List<String> getSupportOperateCodeList() {
        return this.supportOperateCodeList;
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
