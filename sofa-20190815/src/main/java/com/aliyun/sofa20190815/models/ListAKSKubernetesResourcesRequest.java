// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSKubernetesResourcesRequest extends TeaModel {
    @NameInMap("Cluster")
    public String cluster;

    @NameInMap("LabelSelector")
    public String labelSelector;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Path")
    public String path;

    @NameInMap("QueryAll")
    public Boolean queryAll;

    @NameInMap("Workspace")
    public String workspace;

    public static ListAKSKubernetesResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAKSKubernetesResourcesRequest self = new ListAKSKubernetesResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListAKSKubernetesResourcesRequest setCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }
    public String getCluster() {
        return this.cluster;
    }

    public ListAKSKubernetesResourcesRequest setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
        return this;
    }
    public String getLabelSelector() {
        return this.labelSelector;
    }

    public ListAKSKubernetesResourcesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAKSKubernetesResourcesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAKSKubernetesResourcesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAKSKubernetesResourcesRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListAKSKubernetesResourcesRequest setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }
    public Boolean getQueryAll() {
        return this.queryAll;
    }

    public ListAKSKubernetesResourcesRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
