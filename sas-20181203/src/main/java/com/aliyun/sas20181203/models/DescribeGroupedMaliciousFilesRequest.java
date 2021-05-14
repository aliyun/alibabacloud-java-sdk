// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedMaliciousFilesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Levels")
    public String levels;

    @NameInMap("FuzzyMaliciousName")
    public String fuzzyMaliciousName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("RepoRegionId")
    public String repoRegionId;

    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    @NameInMap("RepoId")
    public String repoId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("ImageTag")
    public String imageTag;

    @NameInMap("ImageDigest")
    public String imageDigest;

    @NameInMap("ImageLayer")
    public String imageLayer;

    public static DescribeGroupedMaliciousFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedMaliciousFilesRequest self = new DescribeGroupedMaliciousFilesRequest();
        return TeaModel.build(map, self);
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

    public DescribeGroupedMaliciousFilesRequest setFuzzyMaliciousName(String fuzzyMaliciousName) {
        this.fuzzyMaliciousName = fuzzyMaliciousName;
        return this;
    }
    public String getFuzzyMaliciousName() {
        return this.fuzzyMaliciousName;
    }

    public DescribeGroupedMaliciousFilesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedMaliciousFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeGroupedMaliciousFilesRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
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

    public DescribeGroupedMaliciousFilesRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
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

}
