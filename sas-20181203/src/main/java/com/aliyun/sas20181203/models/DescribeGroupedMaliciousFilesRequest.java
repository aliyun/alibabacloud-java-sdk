// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The cluster ID of the container on which the malicious image sample is detected.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The number of the page to return. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the malicious image sample that you want to query.</p>
     * <br>
     * <p>>  Fuzzy match is supported.</p>
     */
    @NameInMap("FuzzyMaliciousName")
    public String fuzzyMaliciousName;

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
     * <p>The image tag.</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **serious**</p>
     * <p>*   **suspicious**</p>
     * <p>*   **remind**</p>
     */
    @NameInMap("Levels")
    public String levels;

    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the image repository.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~145293~~) operation to query the IDs of image repositories from the value of the **RepoId** response parameter.</p>
     */
    @NameInMap("RepoId")
    public String repoId;

    /**
     * <p>The ID of the container image.</p>
     * <br>
     * <p>>  You can call the [ListRepository](~~145293~~) operation to query the IDs of container images from the value of the **InstanceId** response parameter.</p>
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
