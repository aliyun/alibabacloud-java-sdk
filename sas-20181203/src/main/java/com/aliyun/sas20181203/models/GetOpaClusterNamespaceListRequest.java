// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterNamespaceListRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("NameSpaceName")
    public String nameSpaceName;

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
