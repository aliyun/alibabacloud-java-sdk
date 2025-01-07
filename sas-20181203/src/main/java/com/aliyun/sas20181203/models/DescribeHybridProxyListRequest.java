// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyListRequest extends TeaModel {
    /**
     * <p>The name of the proxy cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>idc-sas-proxy</p>
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
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeHybridProxyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyListRequest self = new DescribeHybridProxyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyListRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DescribeHybridProxyListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeHybridProxyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
