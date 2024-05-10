// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterLabelListRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](https://help.aliyun.com/document_detail/182997.html) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Default value: 200. If you leave the PageSize parameter empty, 200 entries are returned by default. Maximum value: 200.</p>
     * <br>
     * <p>>  We recommend that you do not leave this parameter empty.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the tag.</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static GetOpaClusterLabelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterLabelListRequest self = new GetOpaClusterLabelListRequest();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterLabelListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetOpaClusterLabelListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOpaClusterLabelListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetOpaClusterLabelListRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
