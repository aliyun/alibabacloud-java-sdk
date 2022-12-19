// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameRequest extends TeaModel {
    // The name of the image baseline.
    @NameInMap("BaselineNameKey")
    public String baselineNameKey;

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

    // The search condition for the image baseline.
    @NameInMap("Criteria")
    public String criteria;

    // The type of the search condition. Valid values:
    // 
    // *   **BaselineNameAlias**: baseline name
    // *   **BaselineClassAlias**: baseline category
    @NameInMap("CriteriaType")
    public String criteriaType;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The name of the image to which the container belongs.
    @NameInMap("Image")
    public String image;

    // The SHA-256 value of the image digest.
    @NameInMap("ImageDigest")
    public String imageDigest;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The namespace.
    @NameInMap("Namespace")
    public String namespace;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The pod.
    @NameInMap("Pod")
    public String pod;

    // The instance ID of the image repository.
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    // The name of the image repository.
    @NameInMap("RepoName")
    public String repoName;

    // The namespace to which the image repository belongs.
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    // The types of the assets that you want to scan.
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
