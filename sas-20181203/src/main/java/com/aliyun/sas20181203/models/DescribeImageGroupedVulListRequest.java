// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListRequest extends TeaModel {
    @NameInMap("AliasName")
    public String aliasName;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("CveId")
    public String cveId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ImageDigest")
    public String imageDigest;

    @NameInMap("ImageLayer")
    public String imageLayer;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("IsLatest")
    public Integer isLatest;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PatchId")
    public Long patchId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("RepoRegionId")
    public String repoRegionId;

    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    @NameInMap("Type")
    public String type;

    @NameInMap("Uuids")
    public String uuids;

    public static DescribeImageGroupedVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListRequest self = new DescribeImageGroupedVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeImageGroupedVulListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageGroupedVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageGroupedVulListRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public DescribeImageGroupedVulListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public DescribeImageGroupedVulListRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeImageGroupedVulListRequest setIsLatest(Integer isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Integer getIsLatest() {
        return this.isLatest;
    }

    public DescribeImageGroupedVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageGroupedVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageGroupedVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeImageGroupedVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageGroupedVulListRequest setPatchId(Long patchId) {
        this.patchId = patchId;
        return this;
    }
    public Long getPatchId() {
        return this.patchId;
    }

    public DescribeImageGroupedVulListRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeImageGroupedVulListRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
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

    public DescribeImageGroupedVulListRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeImageGroupedVulListRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageGroupedVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeImageGroupedVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
