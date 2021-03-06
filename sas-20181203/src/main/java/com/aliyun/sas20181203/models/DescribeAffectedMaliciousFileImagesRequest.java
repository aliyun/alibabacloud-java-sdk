// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAffectedMaliciousFileImagesRequest extends TeaModel {
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("Lang")
    public String lang;

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

    public static DescribeAffectedMaliciousFileImagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAffectedMaliciousFileImagesRequest self = new DescribeAffectedMaliciousFileImagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAffectedMaliciousFileImagesRequest setMaliciousMd5(String maliciousMd5) {
        this.maliciousMd5 = maliciousMd5;
        return this;
    }
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    public DescribeAffectedMaliciousFileImagesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAffectedMaliciousFileImagesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAffectedMaliciousFileImagesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoRegionId(String repoRegionId) {
        this.repoRegionId = repoRegionId;
        return this;
    }
    public String getRepoRegionId() {
        return this.repoRegionId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeAffectedMaliciousFileImagesRequest setRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }
    public String getRepoId() {
        return this.repoId;
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

    public DescribeAffectedMaliciousFileImagesRequest setImageTag(String imageTag) {
        this.imageTag = imageTag;
        return this;
    }
    public String getImageTag() {
        return this.imageTag;
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

}
