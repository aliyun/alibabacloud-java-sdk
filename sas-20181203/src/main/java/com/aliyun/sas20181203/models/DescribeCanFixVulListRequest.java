// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanFixVulListRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The container ID.</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <br>
     * <p>**y**: The vulnerability is handled. **n**: The vulnerability is not handled.</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The unique identifier of the image.</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The name of the image.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~451339~~) operation of Container Registry and obtain the ID of the container image from **InstanceId** in the response.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the cluster.</p>
     * <br>
     * <p>>  You can call the [GetOpaClusterNamespaceList](~~GetOpaClusterNamespaceList~~) operation to query the namespaces of clusters.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **asap**: high</p>
     * <p>*   **later**: medium</p>
     * <p>*   **nntf**: low</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the container group.</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The region ID of the image repository. Valid values:</p>
     * <br>
     * <p>*   **cn-beijing**: China (Beijing)</p>
     * <p>*   **cn-zhangjiakou**: China (Zhangjiakou)</p>
     * <p>*   **cn-hangzhou**: China (Hangzhou)</p>
     * <p>*   **cn-shanghai**: China (Shanghai)</p>
     * <p>*   **cn-shenzhen**: China (Shenzhen)</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <p>*   **ap-southeast-5**: Indonesia (Jakarta)</p>
     * <p>*   **us-east-1**: US (Virginia)</p>
     * <p>*   **us-west-1**: US (Silicon Valley)</p>
     * <p>*   **eu-central-1**: Germany (Frankfurt)</p>
     * <p>*   **eu-west-1**: UK (London)</p>
     * <p>*   **ap-south-1**: India (Mumbai)</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image repository.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~145293~~) operation of Container Registry and obtain the ID of the image repository from **RepoId** in the response.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~451339~~) operation of Container Registry and obtain the ID of the container image from **InstanceId** in the response.</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     * <br>
     * <p>>  Fuzzy match is supported.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * <br>
     * <p>>  Fuzzy match is supported.</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The region ID of the image repository. Valid values:</p>
     * <br>
     * <p>*   **cn-beijing**: China (Beijing)</p>
     * <p>*   **cn-zhangjiakou**: China (Zhangjiakou)</p>
     * <p>*   **cn-hangzhou**: China (Hangzhou)</p>
     * <p>*   **cn-shanghai**: China (Shanghai)</p>
     * <p>*   **cn-shenzhen**: China (Shenzhen)</p>
     * <p>*   **cn-hongkong**: China (Hong Kong)</p>
     * <p>*   **ap-southeast-1**: Singapore</p>
     * <p>*   **ap-southeast-5**: Indonesia (Jakarta)</p>
     * <p>*   **us-east-1**: US (Virginia)</p>
     * <p>*   **us-west-1**: US (Silicon Valley)</p>
     * <p>*   **eu-central-1**: Germany (Frankfurt)</p>
     * <p>*   **eu-west-1**: UK (London)</p>
     * <p>*   **ap-south-1**: India (Mumbai)</p>
     */
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    /**
     * <p>The type of the asset that you want to scan. Valid values:</p>
     * <br>
     * <p>*   **image**</p>
     * <p>*   **container**</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **1**: The vulnerability is unfixed.</p>
     * <p>*   **4**: The vulnerability is being fixed.</p>
     * <p>*   **7**:The vulnerability is fixed.</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The tag to add to the image.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: system vulnerability</p>
     * <p>*   **sca**: application vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the image. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeCanFixVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCanFixVulListRequest self = new DescribeCanFixVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCanFixVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeCanFixVulListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeCanFixVulListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeCanFixVulListRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeCanFixVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCanFixVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeCanFixVulListRequest setDigest(String digest) {
        this.digest = digest;
        return this;
    }
    public String getDigest() {
        return this.digest;
    }

    public DescribeCanFixVulListRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DescribeCanFixVulListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeCanFixVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeCanFixVulListRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeCanFixVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeCanFixVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCanFixVulListRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public DescribeCanFixVulListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeCanFixVulListRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeCanFixVulListRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeCanFixVulListRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeCanFixVulListRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeCanFixVulListRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeCanFixVulListRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeCanFixVulListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeCanFixVulListRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeCanFixVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeCanFixVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
