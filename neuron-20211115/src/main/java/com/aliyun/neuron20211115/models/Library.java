// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class Library extends TeaModel {
    @NameInMap("artifactId")
    public String artifactId;

    @NameInMap("assetType")
    public String assetType;

    @NameInMap("company")
    public String company;

    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("dependCount")
    public Integer dependCount;

    @NameInMap("description")
    public String description;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("id")
    public Long id;

    @NameInMap("industry")
    public String industry;

    @NameInMap("isWatched")
    public Boolean isWatched;

    @NameInMap("name")
    public String name;

    @NameInMap("provider")
    public String provider;

    @NameInMap("providerName")
    public String providerName;

    @NameInMap("repoUrl")
    public String repoUrl;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("reviewId")
    public Long reviewId;

    @NameInMap("status")
    public String status;

    @NameInMap("stepStatus")
    public String stepStatus;

    @NameInMap("watchCount")
    public Integer watchCount;

    public static Library build(java.util.Map<String, ?> map) throws Exception {
        Library self = new Library();
        return TeaModel.build(map, self);
    }

    public Library setArtifactId(String artifactId) {
        this.artifactId = artifactId;
        return this;
    }
    public String getArtifactId() {
        return this.artifactId;
    }

    public Library setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public Library setCompany(String company) {
        this.company = company;
        return this;
    }
    public String getCompany() {
        return this.company;
    }

    public Library setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public Library setDependCount(Integer dependCount) {
        this.dependCount = dependCount;
        return this;
    }
    public Integer getDependCount() {
        return this.dependCount;
    }

    public Library setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Library setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public Library setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public Library setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public Library setIsWatched(Boolean isWatched) {
        this.isWatched = isWatched;
        return this;
    }
    public Boolean getIsWatched() {
        return this.isWatched;
    }

    public Library setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Library setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Library setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public Library setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }
    public String getRepoUrl() {
        return this.repoUrl;
    }

    public Library setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Library setReviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }
    public Long getReviewId() {
        return this.reviewId;
    }

    public Library setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Library setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }
    public String getStepStatus() {
        return this.stepStatus;
    }

    public Library setWatchCount(Integer watchCount) {
        this.watchCount = watchCount;
        return this;
    }
    public Integer getWatchCount() {
        return this.watchCount;
    }

}
