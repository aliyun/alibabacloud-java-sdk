// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsShrinkRequest extends TeaModel {
    /**
     * <p>The unique ID of the alert event.</p>
     * <blockquote>
     * <p>To query the exception event information of a single alert event, you must provide the unique ID of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8df914418f4211fb****</p>
     */
    @NameInMap("AlarmUniqueInfo")
    public String alarmUniqueInfo;

    /**
     * <p>The list of asset types.</p>
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
     * <li><strong>instanceId</strong>: Instance ID.</li>
     * <li><strong>appName</strong>: Application name.</li>
     * <li><strong>clusterId</strong>: Cluster ID.</li>
     * <li><strong>regionId</strong>: Region ID.</li>
     * <li><strong>nodeName</strong>: Node name.</li>
     * <li><strong>namespace</strong>: Namespace.</li>
     * <li><strong>clusterName</strong>: Cluster name.</li>
     * <li><strong>image</strong>: Image name.</li>
     * <li><strong>imageRepoName</strong>: Image repository name.</li>
     * <li><strong>imageRepoNamespace</strong>: Image repository namespace.</li>
     * <li><strong>imageRepoTag</strong>: Image tag.</li>
     * <li><strong>imageDigest</strong>: Image digest.</li>
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
     * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies whether the alert events to query are handled. Valid values:</p>
     * <ul>
     * <li><strong>N</strong>: Pending.</li>
     * <li><strong>Y</strong>: Handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The detection source. This field is invalid.</p>
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
     * <p>The identifier of the data source to which the alert event belongs. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group affected by the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>18768</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The unique ID of the alert event record.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The urgency levels of the alert events to query. Separate multiple urgency levels with commas (,). The urgency levels are listed in descending order. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: Urgent.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>remind</strong>: Reminder.</li>
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
     * <li><strong>0</strong>: Query data of the current account.</li>
     * <li><strong>1</strong>: Query data of all accounts.</li>
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
     * <p>The list of alert event handling result codes.</p>
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
     * <p>The settings for the paged query, specifying the number of alert events to return on each page. Default value: <strong>20</strong>, which indicates that 20 alert events are returned on each page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alarm Metric of the alert events to query. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal process behavior</strong></li>
     * <li><strong>Web shell</strong></li>
     * <li><strong>Unusual logon</strong></li>
     * <li><strong>Abnormal events</strong></li>
     * <li><strong>Sensitive file tampering</strong></li>
     * <li><strong>Malicious process (cloud scan)</strong></li>
     * <li><strong>Suspicious network connection</strong></li>
     * <li><strong>Abnormal accounts</strong></li>
     * <li><strong>Application intrusion events</strong></li>
     * <li><strong>Cloud service threat detection</strong></li>
     * <li><strong>Precise defense</strong></li>
     * <li><strong>Application whitelist</strong></li>
     * <li><strong>Persistent backdoor</strong></li>
     * <li><strong>Web application threat detection</strong></li>
     * <li><strong>Malicious scripts</strong></li>
     * <li><strong>Threat intelligence</strong></li>
     * <li><strong>Malicious network behavior</strong></li>
     * <li><strong>Container cluster anomalies</strong></li>
     * <li><strong>Web shell (local scan)</strong></li>
     * <li><strong>Vulnerability exploits</strong></li>
     * <li><strong>Malicious process (local scan)</strong></li>
     * <li><strong>Trusted exceptions</strong></li>
     * <li><strong>Others</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>other</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The alert name or asset information to query.</p>
     * <blockquote>
     * <p>Fuzzy match is supported. Asset information includes the asset name, public IP address, and internal IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resource folder member accounts belong.</p>
     * <blockquote>
     * <p>You can invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
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
     * <li><strong>lastTime</strong>: Latest occurrence time.</li>
     * <li><strong>operateTime</strong>: Handling time.</li>
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
     * <p>The custom sort order. Default value: <strong>desc</strong>. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: Ascending order.</li>
     * <li><strong>desc</strong>: Descending order.</li>
     * </ul>
     * <blockquote>
     * <p>This field takes effect only when <strong>Dealed</strong> is set to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("SortType")
    public String sortType;

    /**
     * <p>The source of the alert.</p>
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
    public String sourceAliUidsShrink;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the alert events to query. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: All.</li>
     * <li><strong>1</strong>: Pending.</li>
     * <li><strong>2</strong>: Ignored.</li>
     * <li><strong>4</strong>: Confirmed.</li>
     * <li><strong>8</strong>: Marked as false positive.</li>
     * <li><strong>16</strong>: Processing.</li>
     * <li><strong>32</strong>: Handled.</li>
     * <li><strong>64</strong>: Expired.</li>
     * <li><strong>128</strong>: Deleted.</li>
     * <li><strong>512</strong>: Automatically blocking.</li>
     * <li><strong>513</strong>: Automatically blocked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether the alert is in strict mode. Valid values:</p>
     * <ul>
     * <li>N: No.</li>
     * <li>Y: Yes.</li>
     * </ul>
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
     * <p>The ATT&amp;CK tactic ID.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0001</p>
     */
    @NameInMap("TacticId")
    public String tacticId;

    /**
     * <p>The container search target type. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: Container ID.</li>
     * <li><strong>uuid</strong>: Server UUID.</li>
     * <li><strong>imageUuid</strong>: Image UUID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time of the latest occurrence. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time of the latest occurrence. Format: YYYY-MM-DD HH:mm:ss.</p>
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

    public static DescribeSuspEventsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsShrinkRequest self = new DescribeSuspEventsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsShrinkRequest setAlarmUniqueInfo(String alarmUniqueInfo) {
        this.alarmUniqueInfo = alarmUniqueInfo;
        return this;
    }
    public String getAlarmUniqueInfo() {
        return this.alarmUniqueInfo;
    }

    public DescribeSuspEventsShrinkRequest setAssetsTypeList(java.util.List<String> assetsTypeList) {
        this.assetsTypeList = assetsTypeList;
        return this;
    }
    public java.util.List<String> getAssetsTypeList() {
        return this.assetsTypeList;
    }

    public DescribeSuspEventsShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeSuspEventsShrinkRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeSuspEventsShrinkRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeSuspEventsShrinkRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsShrinkRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeSuspEventsShrinkRequest setDetectSource(String detectSource) {
        this.detectSource = detectSource;
        return this;
    }
    public String getDetectSource() {
        return this.detectSource;
    }

    public DescribeSuspEventsShrinkRequest setEventNames(String eventNames) {
        this.eventNames = eventNames;
        return this;
    }
    public String getEventNames() {
        return this.eventNames;
    }

    public DescribeSuspEventsShrinkRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeSuspEventsShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeSuspEventsShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeSuspEventsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSuspEventsShrinkRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeSuspEventsShrinkRequest setMultiAccountActionType(Integer multiAccountActionType) {
        this.multiAccountActionType = multiAccountActionType;
        return this;
    }
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
    }

    public DescribeSuspEventsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeSuspEventsShrinkRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
        this.operateErrorCodeList = operateErrorCodeList;
        return this;
    }
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    public DescribeSuspEventsShrinkRequest setOperateTimeEnd(String operateTimeEnd) {
        this.operateTimeEnd = operateTimeEnd;
        return this;
    }
    public String getOperateTimeEnd() {
        return this.operateTimeEnd;
    }

    public DescribeSuspEventsShrinkRequest setOperateTimeStart(String operateTimeStart) {
        this.operateTimeStart = operateTimeStart;
        return this;
    }
    public String getOperateTimeStart() {
        return this.operateTimeStart;
    }

    public DescribeSuspEventsShrinkRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsShrinkRequest setParentEventTypes(String parentEventTypes) {
        this.parentEventTypes = parentEventTypes;
        return this;
    }
    public String getParentEventTypes() {
        return this.parentEventTypes;
    }

    public DescribeSuspEventsShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeSuspEventsShrinkRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeSuspEventsShrinkRequest setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
        return this;
    }
    public String getSortColumn() {
        return this.sortColumn;
    }

    public DescribeSuspEventsShrinkRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public DescribeSuspEventsShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeSuspEventsShrinkRequest setSourceAliUidsShrink(String sourceAliUidsShrink) {
        this.sourceAliUidsShrink = sourceAliUidsShrink;
        return this;
    }
    public String getSourceAliUidsShrink() {
        return this.sourceAliUidsShrink;
    }

    public DescribeSuspEventsShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSuspEventsShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSuspEventsShrinkRequest setStrictMode(String strictMode) {
        this.strictMode = strictMode;
        return this;
    }
    public String getStrictMode() {
        return this.strictMode;
    }

    public DescribeSuspEventsShrinkRequest setSupportOperateCodeList(java.util.List<String> supportOperateCodeList) {
        this.supportOperateCodeList = supportOperateCodeList;
        return this;
    }
    public java.util.List<String> getSupportOperateCodeList() {
        return this.supportOperateCodeList;
    }

    public DescribeSuspEventsShrinkRequest setTacticId(String tacticId) {
        this.tacticId = tacticId;
        return this;
    }
    public String getTacticId() {
        return this.tacticId;
    }

    public DescribeSuspEventsShrinkRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeSuspEventsShrinkRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public DescribeSuspEventsShrinkRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

    public DescribeSuspEventsShrinkRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public DescribeSuspEventsShrinkRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
