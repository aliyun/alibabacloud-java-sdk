// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageListWithBaselineNameRequest extends TeaModel {
    /**
     * <p>The name of the image baseline.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BaselineNameKey")
    public String baselineNameKey;

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
     * <p>The search condition for the image baseline.</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The type of the search condition. Valid values:</p>
     * <br>
     * <p>*   **BaselineNameAlias**: baseline name</p>
     * <p>*   **BaselineClassAlias**: baseline category</p>
     */
    @NameInMap("CriteriaType")
    public String criteriaType;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the image to which the container belongs.</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The SHA-256 value of the image digest.</p>
     */
    @NameInMap("ImageDigest")
    public String imageDigest;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The number of entries to return on each page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The pod.</p>
     */
    @NameInMap("Pod")
    public String pod;

    /**
     * <p>The instance ID of the image repository.</p>
     */
    @NameInMap("RepoInstanceId")
    public String repoInstanceId;

    /**
     * <p>The name of the image repository.</p>
     */
    @NameInMap("RepoName")
    public String repoName;

    /**
     * <p>The namespace to which the image repository belongs.</p>
     */
    @NameInMap("RepoNamespace")
    public String repoNamespace;

    /**
     * <p>The types of the assets that you want to scan.</p>
     */
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
