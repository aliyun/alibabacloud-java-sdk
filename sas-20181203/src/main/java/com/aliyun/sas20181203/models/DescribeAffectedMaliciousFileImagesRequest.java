// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of container clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c60b77fe62093480db6164a3c2fa5****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>minikube</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>cc20a1024011c44b6a8710d6f8b****</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the container image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry.cn-wulanchabu.aliyuncs.com/sas_test/huxin-test-001:nuxeo6-****</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>6a5e103187b31a94592a47a5858617f7a179ead61df7606****</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The image layer.</p>
     * 
     * <strong>example:</strong>
     * <p>27213ad375b53628dd152a5ca****</p>
     */
    @NameInMap("ImageLayer")
    public String imageLayer;

    /**
     * <p>The tag that is added to the image.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
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
     * <p>The severity level of the malicious image sample. Separate multiple severity levels with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>serious</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>remind</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious,suspicious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The MD5 hash value of the malicious image sample.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedMaliciousFiles~~">DescribeGroupedMaliciousFiles</a> operation to query the MD5 hash values of malicious image samples.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>d836968041f7683b5459****</p>
     */
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    /**
     * <p>The namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>test-002</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: <strong>20</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The pod.</p>
     * 
     * <strong>example:</strong>
     * <p>22222-7xsqq</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation to query the IDs of image repositories from the value of the <strong>RepoId</strong> response parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>crr-vridcl4****</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the container image.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/451339.html">ListRepository</a> operation to query the IDs of container images from the value of the <strong>InstanceId</strong> response parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cri-datvailb****</p>
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
     * <p>centos</p>
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
     * <p>hanghai-namespace</p>
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
     * <p>The types of the assets that you want to scan.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the malicious image sample. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The malicious image sample is not handled.</li>
     * <li><strong>1</strong>: The malicious image sample is handled.</li>
     * <li><strong>2</strong>: The malicious image sample is being verified.</li>
     * <li><strong>3</strong>: The malicious image sample is added to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeAffectedMaliciousFileImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedMaliciousFileImagesRequest self = new DescribeAffectedMaliciousFileImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedMaliciousFileImagesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeAffectedMaliciousFileImagesRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAffectedMaliciousFileImagesRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DescribeAffectedMaliciousFileImagesRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeAffectedMaliciousFileImagesRequest setImageLayer(String imageLayer) {
        this.imageLayer = imageLayer;
        return this;
    }
    public String getImageLayer() {
        return this.imageLayer;
    }

    public DescribeAffectedMaliciousFileImagesRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeAffectedMaliciousFileImagesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAffectedMaliciousFileImagesRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeAffectedMaliciousFileImagesRequest setMaliciousMd5(String maliciousMd5) {
        this.maliciousMd5 = maliciousMd5;
        return this;
    }
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    public DescribeAffectedMaliciousFileImagesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeAffectedMaliciousFileImagesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAffectedMaliciousFileImagesRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public DescribeAffectedMaliciousFileImagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
