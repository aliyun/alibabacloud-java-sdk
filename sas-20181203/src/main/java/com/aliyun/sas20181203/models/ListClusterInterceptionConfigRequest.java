// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigRequest extends TeaModel {
    @NameInMap("ClusterCNNFStatus")
    public Integer clusterCNNFStatus;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListClusterInterceptionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInterceptionConfigRequest self = new ListClusterInterceptionConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListClusterInterceptionConfigRequest setClusterCNNFStatus(Integer clusterCNNFStatus) {
        this.clusterCNNFStatus = clusterCNNFStatus;
        return this;
    }
    public Integer getClusterCNNFStatus() {
        return this.clusterCNNFStatus;
    }

    public ListClusterInterceptionConfigRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListClusterInterceptionConfigRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ListClusterInterceptionConfigRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListClusterInterceptionConfigRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
