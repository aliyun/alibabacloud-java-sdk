// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("AssetType")
    public String assetType;

    @NameInMap("AttachTypes")
    public String attachTypes;

    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SearchTags")
    public String searchTags;

    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The total number of fixed vulnerabilities.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The number of vulnerabilities that have the **high** priority.</p>
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
