// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The cluster ID of the container on which the malicious image sample is detected.</p>
     * 
     * <strong>example:</strong>
     * <p>c556c8133b5ad4378b7fc533ddbda****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

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
     * <p>The name of the malicious image sample that you want to query.</p>
     * <blockquote>
     * <p> Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Mining</p>
     */
    @NameInMap("FuzzyMaliciousName")
    public String fuzzyMaliciousName;

    /**
     * <p>The image digest.</p>
     * 
     * <strong>example:</strong>
     * <p>6a5e103187b31a94592a47a5858617f7****</p>
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
     * <p>The image tag.</p>
     * 
     * <strong>example:</strong>
     * <p>0.2</p>
     */
    @NameInMap("ImageTag")
    public String imageTag;

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
     * <p>The severity of the malicious image sample that you want to query. You can enter multiple severities. Separate the severities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>serious</strong></li>
     * <li><strong>suspicious</strong></li>
     * <li><strong>remind</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>serious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The MD5 hash value of the malicious image sample.</p>
     * 
     * <strong>example:</strong>
     * <p>d836968041f7683b5459****</p>
     */
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

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
     * <p>The ID of the image repository.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/145293.html">ListRepository</a> operation to query the IDs of image repositories from the value of the <strong>RepoId</strong> response parameter.</p>
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
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/145293.html">ListRepository</a> operation to query the IDs of container images from the value of the <strong>InstanceId</strong> response parameter.</p>
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
     * <p>cn-shanghai</p>
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
