// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportSuspEventsRequest extends TeaModel {
    /**
     * <p>The collection of asset types.</p>
     */
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    /**
     * <p>The ID of the cluster to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
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
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container search field.</p>
     * 
     * <strong>example:</strong>
     * <p>c819391d2d520485fa3e81e2dc2ea****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The page number of the current page in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>Specifies whether the alert event is handled. Valid values:</p>
     * <ul>
     * <li><strong>N</strong>: Unhandled.</li>
     * <li><strong>Y</strong>: Handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The data source identifier of the anomaly event. Set the value to sas.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>9454789</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The unique ID of the alert event record.</p>
     * 
     * <strong>example:</strong>
     * <p>17821</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The severity levels of the alert events to query. Separate multiple severity levels with commas (,). The severity levels are listed in descending order. Valid values:</p>
     * <ul>
     * <li><strong>serious</strong>: Urgent.</li>
     * <li><strong>suspicious</strong>: Suspicious.</li>
     * <li><strong>remind</strong>: Reminder.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious,suspicious,remind</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The full name of the anomaly event.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The collection of alert event handling result codes.</p>
     */
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The maximum number of entries per page in a paged query. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The Alarm Metric of the alerting events to query. Valid values:</p>
     * <ul>
     * <li><strong>Abnormal process behavior</strong></li>
     * <li><strong>Web shell</strong></li>
     * <li><strong>Unusual logon</strong></li>
     * <li><strong>Anomaly event</strong></li>
     * <li><strong>Sensitive file tampering</strong></li>
     * <li><strong>Malicious process (cloud scan)</strong></li>
     * <li><strong>Suspicious network connection</strong></li>
     * <li><strong>Abnormal account</strong></li>
     * <li><strong>Application intrusion event</strong></li>
     * <li><strong>Cloud service threat detection</strong></li>
     * <li><strong>Precise defense</strong></li>
     * <li><strong>Application whitelist</strong></li>
     * <li><strong>Persistent backdoor</strong></li>
     * <li><strong>Web application threat detection</strong></li>
     * <li><strong>Malicious script</strong></li>
     * <li><strong>Threat intelligence</strong></li>
     * <li><strong>Malicious network connectivity behavior</strong></li>
     * <li><strong>Container cluster exception</strong></li>
     * <li><strong>Web shell (local scan)</strong></li>
     * <li><strong>Vulnerability exploits</strong></li>
     * <li><strong>Malicious process (local scan)</strong></li>
     * <li><strong>Trusted exception</strong></li>
     * <li><strong>Other</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>remark</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the Alibaba Cloud account of the member accounts in the resource directory.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains this value.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The handling status of the anomaly event. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: All.</li>
     * <li><strong>1</strong>: Unhandled.</li>
     * <li><strong>2</strong>: Ignored.</li>
     * <li><strong>4</strong>: Confirmed.</li>
     * <li><strong>8</strong>: Marked as false positive.</li>
     * <li><strong>16</strong>: Handling.</li>
     * <li><strong>32</strong>: Handled.</li>
     * <li><strong>64</strong>: Expired.</li>
     * <li><strong>128</strong>: Deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The dimension of the target switch configuration. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: asset UUID</li>
     * <li><strong>image_repo</strong>: image repository ID</li>
     * <li><strong>Cluster</strong>: cluster ID</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end time of the anomaly event. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-05 00:00:00</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The start time of the anomaly event occurrence. Format: YYYY-MM-DD HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-01 00:00:00</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the security alert.</p>
     * 
     * <strong>example:</strong>
     * <p>1fbe8d16727f61d1478a674d6fa0****</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The unique identifier of the associated instance.</p>
     * 
     * <strong>example:</strong>
     * <p>18b7336e-d469-473b-af83-8e5420f9****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ExportSuspEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportSuspEventsRequest self = new ExportSuspEventsRequest();
        return TeaModel.build(map, self);
    }

    public ExportSuspEventsRequest setAssetsTypeList(java.util.List<String> assetsTypeList) {
        this.assetsTypeList = assetsTypeList;
        return this;
    }
    public java.util.List<String> getAssetsTypeList() {
        return this.assetsTypeList;
    }

    public ExportSuspEventsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportSuspEventsRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public ExportSuspEventsRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public ExportSuspEventsRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public ExportSuspEventsRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ExportSuspEventsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ExportSuspEventsRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public ExportSuspEventsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ExportSuspEventsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportSuspEventsRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public ExportSuspEventsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExportSuspEventsRequest setOperateErrorCodeList(java.util.List<String> operateErrorCodeList) {
        this.operateErrorCodeList = operateErrorCodeList;
        return this;
    }
    public java.util.List<String> getOperateErrorCodeList() {
        return this.operateErrorCodeList;
    }

    public ExportSuspEventsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ExportSuspEventsRequest setParentEventTypes(String parentEventTypes) {
        this.parentEventTypes = parentEventTypes;
        return this;
    }
    public String getParentEventTypes() {
        return this.parentEventTypes;
    }

    public ExportSuspEventsRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ExportSuspEventsRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ExportSuspEventsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ExportSuspEventsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ExportSuspEventsRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public ExportSuspEventsRequest setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
        return this;
    }
    public String getTimeEnd() {
        return this.timeEnd;
    }

    public ExportSuspEventsRequest setTimeStart(String timeStart) {
        this.timeStart = timeStart;
        return this;
    }
    public String getTimeStart() {
        return this.timeStart;
    }

    public ExportSuspEventsRequest setUniqueInfo(String uniqueInfo) {
        this.uniqueInfo = uniqueInfo;
        return this;
    }
    public String getUniqueInfo() {
        return this.uniqueInfo;
    }

    public ExportSuspEventsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
