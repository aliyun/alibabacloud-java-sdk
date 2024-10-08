// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListClusterInterceptionConfigRequest extends TeaModel {
    /**
     * <p>The status of the container firewall feature. Valid values:</p>
     * <ul>
     * <li><strong>-1</strong>: unknown</li>
     * <li><strong>0</strong>: abnormal</li>
     * <li><strong>1</strong>: normal</li>
     * <li><strong>2</strong>: normal to be confirmed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterCNNFStatus")
    public Integer clusterCNNFStatus;

    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeContainerInstances~~">DescribeContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>c22143730ab6e40b09ec7c1c51d4d****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The name of the cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries to return on each page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
