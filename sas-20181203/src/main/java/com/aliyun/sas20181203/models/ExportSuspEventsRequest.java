// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportSuspEventsRequest extends TeaModel {
    /**
     * <p>The types of assets.</p>
     */
    @NameInMap("AssetsTypeList")
    public java.util.List<String> assetsTypeList;

    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
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
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the condition that is used to query alert events on containers.</p>
     * 
     * <strong>example:</strong>
     * <p>c819391d2d520485fa3e81e2dc2ea****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The status of the alert event. Valid values:</p>
     * <ul>
     * <li><strong>N</strong>: unhandled</li>
     * <li><strong>Y</strong>: handled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The data source of the exception. Set the value to sas.</p>
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
     * <p>8076980</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The unique ID of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>17821</p>
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
     * <p>serious,suspicious,remind</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The complete name of the exception.</p>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The status codes of alert events.</p>
     */
    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
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
     * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The handling status of the exception. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: all status</li>
     * <li><strong>1</strong>: pending handling</li>
     * <li><strong>2</strong>: ignored</li>
     * <li><strong>4</strong>: confirmed</li>
     * <li><strong>8</strong>: marked as false positive</li>
     * <li><strong>16</strong>: handling</li>
     * <li><strong>32</strong>: handled</li>
     * <li><strong>64</strong>: expired</li>
     * <li><strong>128</strong>: deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The dimension from which you want to configure the feature. Valid values:</p>
     * <ul>
     * <li><strong>uuid</strong>: the UUID of the asset</li>
     * <li><strong>image_repo</strong>: the ID of the image repository</li>
     * <li><strong>Cluster</strong>: the ID of the cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end of the time range during which the exception is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-05 00:00:00</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The beginning of the time range during which the exception is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-10-01 00:00:00</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    /**
     * <p>The unique key of the alert event.</p>
     * 
     * <strong>example:</strong>
     * <p>1fbe8d16727f61d1478a674d6fa0****</p>
     */
    @NameInMap("UniqueInfo")
    public String uniqueInfo;

    /**
     * <p>The unique ID of the associated instance.</p>
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
