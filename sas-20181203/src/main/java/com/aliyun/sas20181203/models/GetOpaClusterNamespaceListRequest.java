// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("NameSpaceName")
    public String nameSpaceName;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetOpaClusterNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterNamespaceListRequest self = new GetOpaClusterNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterNamespaceListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetOpaClusterNamespaceListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOpaClusterNamespaceListRequest setNameSpaceName(String nameSpaceName) {
        this.nameSpaceName = nameSpaceName;
        return this;
    }
    public String getNameSpaceName() {
        return this.nameSpaceName;
    }

    public GetOpaClusterNamespaceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
