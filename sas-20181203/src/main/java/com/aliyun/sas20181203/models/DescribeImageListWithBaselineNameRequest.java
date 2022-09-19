// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameRequest extends TeaModel {
    @NameInMap("BaselineNameKey")
    public String baselineNameKey;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("ContainerId")
    public String containerId;

    @NameInMap("Criteria")
    public String criteria;

    @NameInMap("CriteriaType")
    public String criteriaType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Image")
    public String image;

    @NameInMap("ImageDigest")
    public String imageDigest;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Pod")
    public String pod;

    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    @NameInMap("RepoName")
    public String repoName;

    @NameInMap("RepoNamespace")
    public String repoNamespace;

    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    public static DescribeImageListWithBaselineNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageListWithBaselineNameRequest self = new DescribeImageListWithBaselineNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageListWithBaselineNameRequest setBaselineNameKey(String baselineNameKey) {
        this.baselineNameKey = baselineNameKey;
        return this;
    }
    public String getBaselineNameKey() {
        return this.baselineNameKey;
    }

    public DescribeImageListWithBaselineNameRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeImageListWithBaselineNameRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeImageListWithBaselineNameRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public DescribeImageListWithBaselineNameRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public DescribeImageListWithBaselineNameRequest setCriteriaType(String criteriaType) {
        this.criteriaType = criteriaType;
        return this;
    }
    public String getCriteriaType() {
        return this.criteriaType;
    }

    public DescribeImageListWithBaselineNameRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageListWithBaselineNameRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public DescribeImageListWithBaselineNameRequest setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }
    public String getImageDigest() {
        return this.imageDigest;
    }

    public DescribeImageListWithBaselineNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeImageListWithBaselineNameRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeImageListWithBaselineNameRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageListWithBaselineNameRequest setPod(String pod) {
        this.pod = pod;
        return this;
    }
    public String getPod() {
        return this.pod;
    }

    public DescribeImageListWithBaselineNameRequest setRepoInstanceId(String repoInstanceId) {
        this.repoInstanceId = repoInstanceId;
        return this;
    }
    public String getRepoInstanceId() {
        return this.repoInstanceId;
    }

    public DescribeImageListWithBaselineNameRequest setRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public DescribeImageListWithBaselineNameRequest setRepoNamespace(String repoNamespace) {
        this.repoNamespace = repoNamespace;
        return this;
    }
    public String getRepoNamespace() {
        return this.repoNamespace;
    }

    public DescribeImageListWithBaselineNameRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

}
