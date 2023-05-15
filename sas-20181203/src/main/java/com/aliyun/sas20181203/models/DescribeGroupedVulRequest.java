// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    /**
     * <p>$.parameters[10].schema.example</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <br>
     * <p>**y**: handled **n**: The vulnerability is not handled.</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The priorities to fix the vulnerabilities. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **asap**: high</p>
     * <p>*   **later**: medium</p>
     * <p>*   **nntf**: low</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **app**: application vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     * <p>*   **sca**: vulnerability that is detected based on software component analysis</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>$.parameters[11].schema.example</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>$.parameters[11].schema.description</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>Code Execution</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>$.parameters[10].schema.enumValueTitles</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>$.parameters[11].schema.enumValueTitles</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The alias of the vulnerability.</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>Queries vulnerabilities by group.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>$.parameters[10].schema.description</p>
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
