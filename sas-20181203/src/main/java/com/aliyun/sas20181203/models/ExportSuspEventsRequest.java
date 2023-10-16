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
     * <br>
     * <p>> You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
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
     * <p>The number of the page to return.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The status of the alert event. Valid values:</p>
     * <br>
     * <p>*   **N**: unhandled</p>
     * <p>*   **Y**: handled</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The data source of the exception. Set the value to sas.</p>
     */
    @NameInMap("From")
    public String from;

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
     * <p>The complete name of the exception.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OperateErrorCodeList")
    public java.util.List<String> operateErrorCodeList;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
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
     * <p>*   **Others**</p>
     */
    @NameInMap("ParentEventTypes")
    public String parentEventTypes;

    /**
     * <p>The remarks.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The handling status of the exception. Valid values:</p>
     * <br>
     * <p>*   **0**: all status</p>
     * <p>*   **1**: pending handling</p>
     * <p>*   **2**: ignored</p>
     * <p>*   **4**: confirmed</p>
     * <p>*   **8**: marked as false positive</p>
     * <p>*   **16**: handling</p>
     * <p>*   **32**: handled</p>
     * <p>*   **64**: expired</p>
     * <p>*   **128**: deleted</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The dimension from which you want to configure the feature. Valid values:</p>
     * <br>
     * <p>*   **uuid**: the UUID of the asset</p>
     * <p>*   **image_repo**: the ID of the image repository</p>
     * <p>*   **Cluster**: the ID of the cluster</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The end of the time range during which the exception is detected.</p>
     */
    @NameInMap("TimeEnd")
    public String timeEnd;

    /**
     * <p>The beginning of the time range during which the exception is detected.</p>
     */
    @NameInMap("TimeStart")
    public String timeStart;

    @NameInMap("UniqueInfo")
    public String uniqueInfo;

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
