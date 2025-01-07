// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyClusterListRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeHybridProxyClusterListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyClusterListRequest self = new DescribeHybridProxyClusterListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyClusterListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeHybridProxyClusterListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeHybridProxyClusterListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
