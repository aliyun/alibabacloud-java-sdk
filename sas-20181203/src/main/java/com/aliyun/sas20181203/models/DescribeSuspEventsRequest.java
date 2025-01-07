// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsRequest extends TeaModel {
    /**
     * <p>The ID of the alert event.</p>
     * <blockquote>
     * <p>To query the details of an alert event, you must specify the ID of the alert event. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the IDs of alert events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8df914418f4211fb****</p>
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
     * 
     * <strong>example:</strong>
     * <p>c4af4fdf38a98496a9b63c2be5dae****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The key of the condition that is used to query alert events on containers. Valid values:</p>
     * <ul>
     * <li><strong>instanceId</strong>: the ID of the asset</li>
     * <li><strong>appName</strong>: the name of the application</li>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * <li><strong>regionId</strong>: the ID of the region</li>
     * <li><strong>nodeName</strong>: the name of the node</li>
     * <li><strong>namespace</strong>: the namespace</li>
     * <li><strong>clusterName</strong>: the name of the cluster</li>
     * <li><strong>image</strong>: the name of the image</li>
     * <li><strong>imageRepoName</strong>: the name of the image repository</li>
     * <li><strong>imageRepoNamespace</strong>: the namespace to which the image repository belongs</li>
     * <li><strong>imageRepoTag</strong>: the tag that is added to the image</li>
     * <li><strong>imageDigest</strong>: the digest of the image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query alert events on containers.</p>
     * 
     * <strong>example:</strong>
     * <p>ccf9769c22b844ff9b8d57417683b****</p>
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
    public String currentPage;

    /**
     * <p>Specifies whether the alert event is handled. Valid values:</p>
     * <ul>
     * <li><strong>N</strong>: unhandled</li>
     * <li><strong>Y</strong>: handled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The subtype of the alert event. Separate multiple subtypes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("EventNames")
    public String eventNames;

    /**
     * <p>The data source of the alert event. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group to which the affected asset belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>18768</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Id")
    public Long id;

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
     * <p>The severity of the alert event. Separate multiple severities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>serious</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>remind</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The type of the accounts that you want to query. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the current account.</li>
     * <li><strong>1</strong>: all accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiAccountActionType")
    public Integer multiAccountActionType;

    /**
     * <p>The name of the asset that is affected by the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs-xxx</p>
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
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("OperateTimeEnd")
    public String operateTimeEnd;

    /**
     * <p>The timestamp when the handling operation starts.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("OperateTimeStart")
    public String operateTimeStart;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The alert type of the alert event. Valid values:</p>
     * <ul>
     * <li><strong>Suspicious process</strong></li>
     * <li><strong>Webshell</strong></li>
     * <li><strong>Unusual logon</strong></li>
     * <li><strong>Exception</strong></li>
     * <li><strong>Sensitive file tampering</strong></li>
     * <li><strong>Malicious process (cloud threat detection)</strong></li>
     * <li><strong>Suspicious network connection</strong></li>
     * <li><strong>Suspicious account</strong></li>
     * <li><strong>Application intrusion event</strong></li>
     * <li><strong>Cloud threat detection</strong></li>
     * <li><strong>Precise defense</strong></li>
     * <li><strong>Application whitelist</strong></li>
     * <li><strong>Persistent webshell</strong></li>
     * <li><strong>Web application threat detection</strong></li>
     * <li><strong>Malicious script</strong></li>
     * <li><strong>Threat intelligence</strong></li>
     * <li><strong>Malicious network activity</strong></li>
     * <li><strong>Cluster exception</strong></li>
     * <li><strong>Webshell (on-premises threat detection)</strong></li>
     * <li><strong>Vulnerability exploitation</strong></li>
     * <li><strong>Malicious process (on-premises threat detection)</strong></li>
     * <li><strong>Trusted exception</strong></li>
     * <li><strong>Others</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Webshell</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The name of the alert or the information about the asset.</p>
     * <blockquote>
     * <p> Fuzzy search is supported. The asset information includes the name, public IP address, and private IP address of an asset.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to query the ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>16670360956*****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The custom sorting field. Default value: <strong>operateTime</strong>. Valid values:</p>
     * <ul>
     * <li><strong>lastTime</strong>: the latest occurrence time.</li>
     * <li><strong>operateTime</strong>: the handling time.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect if you set the <strong>Dealed</strong> parameter to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>operateTime</p>
     */
    @NameInMap("SortColumn")
    public String sortColumn;

    /**
     * <p>The custom sorting order. Default value: <strong>desc</strong>. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: the ascending order</li>
     * <li><strong>desc</strong>: the descending order</li>
     * </ul>
     * <blockquote>
     * <p> This parameter takes effect if you set the <strong>Dealed</strong> parameter to Y.</p>
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
     * <p>The IDs of the Alibaba Cloud accounts within which alerts are generated.</p>
     */
    @NameInMap("SourceAliUids")
    public java.util.List<Long> sourceAliUids;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The status of the alert event. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: all</li>
     * <li><strong>1</strong>: pending handling</li>
     * <li><strong>2</strong>: ignored</li>
     * <li><strong>4</strong>: confirmed</li>
     * <li><strong>8</strong>: marked as a false positive</li>
     * <li><strong>16</strong>: handling</li>
     * <li><strong>32</strong>: handled</li>
     * <li><strong>64</strong>: expired</li>
     * <li><strong>128</strong>: deleted</li>
     * <li><strong>512</strong>: automatically blocking</li>
     * <li><strong>513</strong>: automatically blocked</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether to enable the strict alerting mode.</p>
     * <ul>
     * <li>N: no</li>
     * <li>Y: Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("StrictMode")
    public String strictMode;

    /**
     * <p>The tactic ID of ATT\&amp;CK.</p>
     * 
     * <strong>example:</strong>
     * <p>TA0001</p>
     */
    @NameInMap("TacticId")
    public String tacticId;

    /**
     * <p>The item that is used to search for the container. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: the ID of the container</li>
     * <li><strong>uuid</strong>: the UUID of the server</li>
     * <li><strong>imageUuid</strong>: the UUID of the image</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time when the alert event was last detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-06 13:50:38</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time when the alert event was last detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-07-05 13:50:38</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the alert.</p>
     * 
     * <strong>example:</strong>
     * <p>73fc06fb175a7405697e402f52864****</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The UUID of the server on which the alert is detected. Separate multiple UUIDs with commas (,).</p>
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
