// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeSidecarInstancesRequest extends TeaModel {
    @NameInMap("AppServiceName")
    public String appServiceName;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PodIp")
    public String podIp;

    @NameInMap("PodStatus")
    public String podStatus;

    @NameInMap("SidecarStatus")
    public String sidecarStatus;

    @NameInMap("SidecarType")
    public String sidecarType;

    @NameInMap("SidecarVersion")
    public String sidecarVersion;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("SortOrder")
    public String sortOrder;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DescribeSidecarInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSidecarInstancesRequest self = new DescribeSidecarInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSidecarInstancesRequest setAppServiceName(String appServiceName) {
        this.appServiceName = appServiceName;
        return this;
    }
    public String getAppServiceName() {
        return this.appServiceName;
    }

    public DescribeSidecarInstancesRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeSidecarInstancesRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeSidecarInstancesRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public DescribeSidecarInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSidecarInstancesRequest setPodIp(String podIp) {
        this.podIp = podIp;
        return this;
    }
    public String getPodIp() {
        return this.podIp;
    }

    public DescribeSidecarInstancesRequest setPodStatus(String podStatus) {
        this.podStatus = podStatus;
        return this;
    }
    public String getPodStatus() {
        return this.podStatus;
    }

    public DescribeSidecarInstancesRequest setSidecarStatus(String sidecarStatus) {
        this.sidecarStatus = sidecarStatus;
        return this;
    }
    public String getSidecarStatus() {
        return this.sidecarStatus;
    }

    public DescribeSidecarInstancesRequest setSidecarType(String sidecarType) {
        this.sidecarType = sidecarType;
        return this;
    }
    public String getSidecarType() {
        return this.sidecarType;
    }

    public DescribeSidecarInstancesRequest setSidecarVersion(String sidecarVersion) {
        this.sidecarVersion = sidecarVersion;
        return this;
    }
    public String getSidecarVersion() {
        return this.sidecarVersion;
    }

    public DescribeSidecarInstancesRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public DescribeSidecarInstancesRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public DescribeSidecarInstancesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeSidecarInstancesRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
