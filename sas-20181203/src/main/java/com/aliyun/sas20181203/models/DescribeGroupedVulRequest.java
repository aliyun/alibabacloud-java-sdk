// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The type of the asset on which the vulnerability is detected. Separate multiple types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **ECS**: Elastic Compute Service (ECS) instance</p>
     * <p>*   **CONTAINER**: container</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The type of the vulnerability. This parameter is valid only for application vulnerabilities. Separate multiple values with commas (,). Valid values:</p>
     * <br>
     * <p>*   **sca**: vulnerability that is detected based on software component analysis</p>
     * <p>*   **app**: application vulnerability</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The key of the condition that is used to query containers. Valid values:</p>
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
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <br>
     * <p>*   **y**: handled</p>
     * <p>*   **n**: not handled</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priorities to fix the vulnerabilities. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **asap**: high</p>
     * <p>*   **later**: medium</p>
     * <p>*   **nntf**: low</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The Alibaba Cloud account ID of the member in the resource directory.</p>
     * <br>
     * <p>>  You can call the [DescribeMonitorAccounts](~~DescribeMonitorAccounts~~) operation to query the account ID.</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>The tag that is used to search for the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **Restart required**</p>
     * <p>*   **Remote utilization**</p>
     * <p>*   **EXP exists**</p>
     * <p>*   **Available**</p>
     * <p>*   **Elevation of Privilege**</p>
     * <p>*   **Code Execution**</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The query type for containers. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the ID of the asset</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the vulnerability that you want to query. Default value: cve. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **app**: application vulnerability that is detected by network scanning</p>
     * <p>*   **sca**: application vulnerability that is detected by software component analysis</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
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

    public DescribeGroupedVulRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeGroupedVulRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
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
