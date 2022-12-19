// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesRequest extends TeaModel {
    // The cluster ID of the container on which the malicious image sample is detected.
    @NameInMap("ClusterId")
    public String clusterId;

    // The number of the page to return. Pages start from page **1**. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The name of the malicious image sample that you want to query.
    // 
    // >  Fuzzy match is supported.
    @NameInMap("FuzzyMaliciousName")
    public String fuzzyMaliciousName;

    // The image digest.
    @NameInMap("ImageDigest")
    public String imageDigest;

    // The image layer.
    @NameInMap("ImageLayer")
    public String imageLayer;

    // The image tag.
    @NameInMap("ImageTag")
    public String imageTag;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:
    // 
    // *   **serious**
    // *   **suspicious**
    // *   **remind**
    @NameInMap("Levels")
    public String levels;

    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    // The number of entries to return on each page. Default value: **20**.
    @NameInMap("PageSize")
    public String pageSize;

    // The ID of the image repository.
    // 
    // >  You can call the [ListRepository](~~145293~~) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.
    @NameInMap("RepoId")
    public String repoId;

    // The ID of the container image.
    // 
    // >  You can call the [ListRepository](~~145293~~) operation to query the IDs of container images from the value of the **InstanceId** response parameter.
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

    public static DescribeGroupedMaliciousFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedMaliciousFilesRequest self = new DescribeGroupedMaliciousFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedMaliciousFilesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeGroupedMaliciousFilesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedMaliciousFilesRequest setFuzzyMaliciousName(String fuzzyMaliciousName) {
        this.fuzzyMaliciousName = fuzzyMaliciousName;
        return this;
    }
    public String getFuzzyMaliciousName() {
        return this.fuzzyMaliciousName;
    }

    public DescribeGroupedMaliciousFilesRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeGroupedMaliciousFilesRequest setImageLayer(String imageLayer) {
        this.imageLayer = imageLayer;
        return this;
    }
    public String getImageLayer() {
        return this.imageLayer;
    }

    public DescribeGroupedMaliciousFilesRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
    }

    public DescribeGroupedMaliciousFilesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedMaliciousFilesRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public DescribeGroupedMaliciousFilesRequest setMaliciousMd5(String maliciousMd5) {
        this.maliciousMd5 = maliciousMd5;
        return this;
    }
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    public DescribeGroupedMaliciousFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeGroupedMaliciousFilesRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

}
