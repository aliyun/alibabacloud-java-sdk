// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesRequest extends TeaModel {
    /**
     * <p>The ID of the container cluster.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The ID of the container.</p>
     */
    @NameInMap("ContainerId")
    public String containerId;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the container image.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The image digest.</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The image layer.</p>
     */
    @NameInMap("ImageLayer")
    public String imageLayer;

    /**
     * <p>The tag that is added to the image.</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The language of the content within the request and the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity level of the malicious image sample. Separate multiple severity levels with commas (,). Valid values:</p>
     * <br>
     * <p>*   **serious**</p>
     * <p>*   **suspicious**</p>
     * <p>*   **remind**</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The MD5 hash value of the malicious image sample.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedMaliciousFiles](~~DescribeGroupedMaliciousFiles~~) operation to query the MD5 hash values of malicious image samples.</p>
     */
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    /**
     * <p>The namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The pod.</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The ID of the image repository.</p>
     * <br>
     * <p>>  You can call the [ListRepository](https://help.aliyun.com/document_detail/451339.html) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>>  You can call the [ListRepository](https://help.aliyun.com/document_detail/451339.html) operation to query the IDs of container images from the value of the **InstanceId** response parameter.</p>
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
     * <p>The types of the assets that you want to scan.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The status of the malicious image sample. Valid values:</p>
     * <br>
     * <p>*   **0**: The malicious image sample is not handled.</p>
     * <p>*   **1**: The malicious image sample is handled.</p>
     * <p>*   **2**: The malicious image sample is being verified.</p>
     * <p>*   **3**: The malicious image sample is added to the whitelist.</p>
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
