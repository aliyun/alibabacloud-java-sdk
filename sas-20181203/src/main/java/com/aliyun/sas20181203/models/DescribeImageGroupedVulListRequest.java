// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The ID of the container cluster.
    // 
    // >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
    @NameInMap("ClusterId")
    public String clusterId;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The Common Vulnerabilities and Exposures (CVE) ID of the vulnerability.
    @NameInMap("CveId")
    public String cveId;

    // The ID of the asset group.
    @NameInMap("GroupId")
    public String groupId;

    // The SHA-256 value of the image digest.
    @NameInMap("ImageDigest")
    public String imageDigest;

    // The layer of the image.
    @NameInMap("ImageLayer")
    public String imageLayer;

    // The tag that is added to the image.
    @NameInMap("ImageTag")
    public String imageTag;

    // Specifies whether to query the vulnerabilities in the latest images. If you do not specify this parameter, the vulnerabilities in all images are queried. Valid values:
    // 
    // *   **0**: no
    // *   **1**: yes
    @NameInMap("IsLatest")
    public Integer isLatest;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the vulnerability.
    @NameInMap("Name")
    public String name;

    // The priority to fix the vulnerability. Valid values:
    // 
    // *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
    // *   **later**: medium. You can fix the vulnerability based on your business requirements.
    // *   **nntf**: low. You can ignore the vulnerability.
    @NameInMap("Necessity")
    public String necessity;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the patch that is used to fix the vulnerability.
    @NameInMap("PatchId")
    public Long patchId;

    // The ID of the image repository.
    @NameInMap("RepoId")
    public String repoId;

    // The instance ID of the image repository.
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    // The name of the image repository.
    @NameInMap("RepoName")
    public String repoName;

    // The namespace to which the image repository belongs.
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    // The region ID of the image repository.
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    // The types of the assets that you want to scan.
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    // The type of the vulnerability that you want to query. Valid values:
    // 
    // *   **cve**: image system vulnerability
    // *   **sca**: image application vulnerability
    @NameInMap("Type")
    public String type;

    // The UUIDs of the assets. Separate multiple UUIDs with commas (,).
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
