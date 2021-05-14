// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListRequest extends TeaModel {
    @NameInMap("Type")
    public String type;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("CveId")
    public String cveId;

    @NameInMap("Uuids")
    public String uuids;

    @NameInMap("Name")
    public String name;

    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("PatchId")
    public Long patchId;

    @NameInMap("Level")
    public String level;

    @NameInMap("LastTsStart")
    public Long lastTsStart;

    @NameInMap("LastTsEnd")
    public Long lastTsEnd;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("CreateTsStart")
    public Long createTsStart;

    @NameInMap("CreateTsEnd")
    public Long createTsEnd;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SearchTags")
    public String searchTags;

    @NameInMap("RepoRegionId")
    public String repoRegionId;

    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ImageDigest")
    public String imageDigest;

    @NameInMap("ImageLayer")
    public String imageLayer;

    @NameInMap("Lang")
    public String lang;

    public static DescribeImageGroupedVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListRequest self = new DescribeImageGroupedVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeImageGroupedVulListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeImageGroupedVulListRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeImageGroupedVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public DescribeImageGroupedVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageGroupedVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeImageGroupedVulListRequest setPatchId(Long patchId) {
        this.patchId = patchId;
        return this;
    }
    public Long getPatchId() {
        return this.patchId;
    }

    public DescribeImageGroupedVulListRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeImageGroupedVulListRequest setLastTsStart(Long lastTsStart) {
        this.lastTsStart = lastTsStart;
        return this;
    }
    public Long getLastTsStart() {
        return this.lastTsStart;
    }

    public DescribeImageGroupedVulListRequest setLastTsEnd(Long lastTsEnd) {
        this.lastTsEnd = lastTsEnd;
        return this;
    }
    public Long getLastTsEnd() {
        return this.lastTsEnd;
    }

    public DescribeImageGroupedVulListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeImageGroupedVulListRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribeImageGroupedVulListRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeImageGroupedVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeImageGroupedVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeImageGroupedVulListRequest setCreateTsStart(Long createTsStart) {
        this.createTsStart = createTsStart;
        return this;
    }
    public Long getCreateTsStart() {
        return this.createTsStart;
    }

    public DescribeImageGroupedVulListRequest setCreateTsEnd(Long createTsEnd) {
        this.createTsEnd = createTsEnd;
        return this;
    }
    public Long getCreateTsEnd() {
        return this.createTsEnd;
    }

    public DescribeImageGroupedVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageGroupedVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageGroupedVulListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeImageGroupedVulListRequest setSearchTags(String searchTags) {
        this.searchTags = searchTags;
        return this;
    }
    public String getSearchTags() {
        return this.searchTags;
    }

    public DescribeImageGroupedVulListRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeImageGroupedVulListRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageGroupedVulListRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeImageGroupedVulListRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageGroupedVulListRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageGroupedVulListRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeImageGroupedVulListRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageGroupedVulListRequest setImageLayer(String imageLayer) {
        this.imageLayer = imageLayer;
        return this;
    }
    public String getImageLayer() {
        return this.imageLayer;
    }

    public DescribeImageGroupedVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
