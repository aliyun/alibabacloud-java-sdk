// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigRequest extends TeaModel {
    /**
     * <p>The status of the container firewall feature. Valid values:</p>
     * <br>
     * <p>*   **-1**: unknown</p>
     * <p>*   **0**: abnormal</p>
     * <p>*   **1**: normal</p>
     * <p>*   **2**: normal to be confirmed</p>
     */
    @NameInMap("ClusterCNNFStatus")
    public Integer clusterCNNFStatus;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>> You can call the [DescribeContainerInstances](~~DescribeContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     */
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
