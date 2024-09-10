// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedContainerInstances~~">DescribeGroupedContainerInstances</a> operation to query the IDs of clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ca0faf43e33904ecbb6c695df7906****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>sit</p>
     */
    @NameInMap("NameSpaceName")
    public String nameSpaceName;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
