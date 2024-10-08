// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulListRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>High severity vulnerability that affects org.eclipse.jetty:jetty-server</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cc20a1024011c44b6a8710d6f8b****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>docker-law</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>c08d5fc1a329a4b88950a253d082f****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong></p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: handled</li>
     * <li><strong>n</strong>: unhandled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>y</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The digest of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d507012</p>
     */
    @NameInMap("Digest")
    public String digest;

    /**
     * <p>The name of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-****</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>1-qeqewqw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>debian:10:CVE-2019-9893</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-002</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The priority to fix the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high. You must fix the vulnerability at the earliest opportunity.</li>
     * <li><strong>later</strong>: medium. You can fix the vulnerability based on your business requirements.</li>
     * <li><strong>nntf</strong>: low. You can ignore the vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>10</strong></p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pod.</p>
     * 
     * <strong>example:</strong>
     * <p>22222-7xsqq</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>qew****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The instance ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>i-qewqrqcsadf****</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>libssh2</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The region ID of the image repository.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    /**
     * <p>The types of the assets that you want to scan.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: unfixed</li>
     * <li><strong>4</strong>: being fixed</li>
     * <li><strong>7</strong>: fixed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The tag that is added to the image.</p>
     * 
     * <strong>example:</strong>
     * <p>oval</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The type of the vulnerability. Set the value to <strong>cve</strong>, which indicates image vulnerabilities.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the assets. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>0004a32a0305a7f6ab5ff9600d47****</p>
     */
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
