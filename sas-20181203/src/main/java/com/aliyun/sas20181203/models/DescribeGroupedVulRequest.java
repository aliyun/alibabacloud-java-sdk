// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability to query.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2019:0230-Important: polkit security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The Asset Type where the vulnerability is detected. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>ECS</strong>: host asset</li>
     * <li><strong>CONTAINER</strong>: container asset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS,CONTAINER</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The vulnerability type. This query condition is valid only for application vulnerabilities. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>sca</strong>: software constituency parsing vulnerability</li>
     * <li><strong>app</strong>: application vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c88fb10da1168494091db6aafc5dd****</p>
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
     * <li><strong>imageDigest</strong>: image digest.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>appName</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value that corresponds to <strong>ContainerFieldName</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cc914b0df156d40148412afe4a581****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The page number of the first page to display in the query results. Default value: <strong>1</strong>, which indicates that the results start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The CVE ID.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeVulListPage~~">DescribeVulListPage</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CVE-2017-15420</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: handled</li>
     * <li><strong>n</strong>: not handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>235454</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language type of the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority of the vulnerability fix to query. Separate multiple priorities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high</li>
     * <li><strong>later</strong>: medium</li>
     * <li><strong>nntf</strong>: low.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap,later,nntf</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of vulnerability entries per page in a paged query. Default value: 10, which indicates that 10 vulnerability entries are displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether Runtime Application Self-Protection (RASP) supports real-time protection against the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not supported.</li>
     * <li><strong>1</strong>: Supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RaspDefend")
    public Integer raspDefend;

    /**
     * <p>The ID of the Alibaba Cloud account that is added as one of the member accounts in a resource folder.</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>127608589417****</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The label used for filtering. Valid values:</p>
     * <ul>
     * <li><strong>Restart required</strong></li>
     * <li><strong>Remote utilization</strong></li>
     * <li><strong>EXP exists</strong></li>
     * <li><strong>Available</strong></li>
     * <li><strong>Privilege escalation</strong></li>
     * <li><strong>Code execution</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Code Execution</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The container query type. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: container ID</li>
     * <li><strong>uuid</strong>: asset ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>containerId</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the vulnerability to query. Default value: cve. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability (network scan)</li>
     * <li><strong>sca</strong>: application vulnerability (software constituency parsing).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the servers to query. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>d42f938c-d962-48a0-90f9-05e4ea****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeGroupedVulRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulRequest self = new DescribeGroupedVulRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeGroupedVulRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public DescribeGroupedVulRequest setAttachTypes(String attachTypes) {
        this.attachTypes = attachTypes;
        return this;
    }
    public String getAttachTypes() {
        return this.attachTypes;
    }

    public DescribeGroupedVulRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeGroupedVulRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeGroupedVulRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeGroupedVulRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeGroupedVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeGroupedVulRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupedVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeGroupedVulRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulRequest setRaspDefend(Integer raspDefend) {
        this.raspDefend = raspDefend;
        return this;
    }
    public Integer getRaspDefend() {
        return this.raspDefend;
    }

    public DescribeGroupedVulRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeGroupedVulRequest setSearchTags(String searchTags) {
        this.searchTags = searchTags;
        return this;
    }
    public String getSearchTags() {
        return this.searchTags;
    }

    public DescribeGroupedVulRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeGroupedVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeGroupedVulRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
