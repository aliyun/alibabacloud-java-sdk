// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesRequest extends TeaModel {
    // The ID of the container cluster.
    // 
    // >  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of container clusters.
    @NameInMap("ClusterId")
    public String clusterId;

    // The name of the cluster.
    @NameInMap("ClusterName")
    public String clusterName;

    // The ID of the container.
    @NameInMap("ContainerId")
    public String containerId;

    // The number of the page to return. Pages start from page **1**. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The name of the container image.
    @NameInMap("Image")
    public String image;

    // The image digest.
    @NameInMap("ImageDigest")
    public String imageDigest;

    // The image layer.
    @NameInMap("ImageLayer")
    public String imageLayer;

    // The tag that is added to the image.
    @NameInMap("ImageTag")
    public String imageTag;

    // The language of the content within the request and the response. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The severity of the malicious image sample. Separate multiple severities with commas (,). Valid values: serious suspicious remind
    @NameInMap("Levels")
    public String levels;

    // The MD5 hash value of the malicious image sample.
    // 
    // >  You can call the [DescribeGroupedMaliciousFiles](~~DescribeGroupedMaliciousFiles~~) operation to query the MD5 hash values of malicious image samples.
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    // The namespace.
    @NameInMap("Namespace")
    public String namespace;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public String pageSize;

    // The pod.
    @NameInMap("Pod")
    public String pod;

    // The ID of the image repository.
    // 
    // >  You can call the [ListRepository](~~ListRepository~~) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.
    @NameInMap("RepoId")
    public String repoId;

    // The ID of the container image.
    // 
    // >  You can call the [ListRepository](~~ListRepository~~) operation to query the IDs of container images from the value of the **InstanceId** response parameter.
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    // The name of the image repository.
    // 
    // >  Fuzzy match is supported.
    @NameInMap("RepoName")
    public String repoName;

    // The namespace to which the image repository belongs.
    // 
    // >  Fuzzy match is supported.
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    // The region ID of the image repository. Valid values:
    // 
    // *   **cn-beijing**: China (Beijing)
    // *   **cn-zhangjiakou**: China (Zhangjiakou)
    // *   **cn-hangzhou**: China (Hangzhou)
    // *   **cn-shanghai**: China (Shanghai)
    // *   **cn-shenzhen**: China (Shenzhen)
    // *   **cn-hongkong**: China (Hong Kong)
    // *   **ap-southeast-1**: Singapore
    // *   **ap-southeast-5**: Indonesia (Jakarta)
    // *   **us-east-1**: US (Virginia)
    // *   **us-west-1**: US (Silicon Valley)
    // *   **eu-central-1**: Germany (Frankfurt)
    // *   **eu-west-1**: UK (London)
    // *   **ap-south-1**: India (Mumbai)
    @NameInMap("RepoRegionId")
    public String repoRegionId;

    // The types of the assets that you want to scan.
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

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

}
