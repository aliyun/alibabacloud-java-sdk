// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCanFixVulListRequest extends TeaModel {
    /**
     * <p>The alias of the vulnerability that is specified in Common Vulnerabilities and Exposures (CVE).</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2017:0184-Important: mysql security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c80f79959fd724a888e1187779b13****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>sas-test-cnnf</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The container ID.</p>
     * 
     * <strong>example:</strong>
     * <p>48a6d9a92435a13ad573372c3f3c63b7e04d106458141df9f92155709d5a****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <p><strong>y</strong>: The vulnerability is handled. <strong>n</strong>: The vulnerability is not handled.</p>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The unique identifier of the image.</p>
     * 
     * <strong>example:</strong>
     * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d50****</p>
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
     * <p>The ID of the container image.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation of Container Registry and obtain the ID of the container image from <strong>InstanceId</strong> in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cri-rv4nvbv8iju4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>scan:AVD-2022-953356</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The namespace of the cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~GetOpaClusterNamespaceList~~">GetOpaClusterNamespaceList</a> operation to query the namespaces of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high</li>
     * <li><strong>later</strong>: medium</li>
     * <li><strong>nntf</strong>: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap,later,nntf</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the container group.</p>
     * 
     * <strong>example:</strong>
     * <p>22222-7xsqq</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The region ID of the image repository. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * <li><strong>us-east-1</strong>: US (Virginia)</li>
     * <li><strong>us-west-1</strong>: US (Silicon Valley)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>eu-west-1</strong>: UK (London)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/145293.html">ListRepository</a> operation of Container Registry and obtain the ID of the image repository from <strong>RepoId</strong> in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>crr-avo7qp02simz2njo</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the container image.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation of Container Registry and obtain the ID of the container image from <strong>InstanceId</strong> in the response.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cri-rv4nvbv8iju4****</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     * <blockquote>
     * <p> Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>digital-account</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     * <blockquote>
     * <p> Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ns-digital-dev</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The region ID of the image repository. Valid values:</p>
     * <ul>
     * <li><strong>cn-beijing</strong>: China (Beijing)</li>
     * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou)</li>
     * <li><strong>cn-hangzhou</strong>: China (Hangzhou)</li>
     * <li><strong>cn-shanghai</strong>: China (Shanghai)</li>
     * <li><strong>cn-shenzhen</strong>: China (Shenzhen)</li>
     * <li><strong>cn-hongkong</strong>: China (Hong Kong)</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta)</li>
     * <li><strong>us-east-1</strong>: US (Virginia)</li>
     * <li><strong>us-west-1</strong>: US (Silicon Valley)</li>
     * <li><strong>eu-central-1</strong>: Germany (Frankfurt)</li>
     * <li><strong>eu-west-1</strong>: UK (London)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    /**
     * <p>The type of the asset that you want to scan. Valid values:</p>
     * <ul>
     * <li><strong>image</strong></li>
     * <li><strong>container</strong></li>
     * </ul>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The vulnerability is unfixed.</li>
     * <li><strong>4</strong>: The vulnerability is being fixed.</li>
     * <li><strong>7</strong>:The vulnerability is fixed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The tag to add to the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1.0</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: system vulnerability</li>
     * <li><strong>sca</strong>: application vulnerability</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the image. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>d15df12472809c1c3b158606c0f1****</p>
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
