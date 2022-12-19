// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The ID of the cluster to which the container belongs.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the cluster.
    @NameInMap("ClusterName")
    public String clusterName;

    // The ID of the container.
    @NameInMap("ContainerId")
    public String containerId;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the vulnerability is handled. Valid values:
    // 
    // *   **y**: yes
    // *   **n**: no
    @NameInMap("Dealed")
    public String dealed;

    // The digest of the image.
    @NameInMap("Digest")
    public String digest;

    // The name of the image.
    @NameInMap("Image")
    public String image;

    // The instance ID of the asset.
    @NameInMap("InstanceId")
    public String instanceId;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the vulnerability.
    @NameInMap("Name")
    public String name;

    // The namespace.
    @NameInMap("Namespace")
    public String namespace;

    // The priority to fix the vulnerability. Valid values:
    // 
    // *   **asap**: high. You must fix the vulnerability at the earliest opportunity.
    // *   **later**: medium. You can fix the vulnerability based on your business requirements.
    // *   **nntf**: low. You can ignore the vulnerability.
    @NameInMap("Necessity")
    public String necessity;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The pod.
    @NameInMap("Pod")
    public String pod;

    // The region ID of the instance.
    @NameInMap("RegionId")
    public String regionId;

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

    // The status of the vulnerability. Valid values:
    // 
    // *   **1**: unfixed
    // *   **4**: being fixed
    // *   **7**: fixed
    @NameInMap("StatusList")
    public String statusList;

    // The tag that is added to the image.
    @NameInMap("Tag")
    public String tag;

    // The type of the vulnerability. Set the value to **CVE**, which indicates image vulnerabilities.
    @NameInMap("Type")
    public String type;

    // The UUIDs of the assets. Separate multiple UUIDs with commas (,).
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeImageVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulListRequest self = new DescribeImageVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeImageVulListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageVulListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeImageVulListRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeImageVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeImageVulListRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public DescribeImageVulListRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DescribeImageVulListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeImageVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageVulListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeImageVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeImageVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageVulListRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public DescribeImageVulListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageVulListRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeImageVulListRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageVulListRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageVulListRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageVulListRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeImageVulListRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeImageVulListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeImageVulListRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeImageVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeImageVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
