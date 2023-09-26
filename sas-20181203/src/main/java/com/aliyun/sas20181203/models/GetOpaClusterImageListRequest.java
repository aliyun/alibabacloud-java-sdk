// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaClusterImageListRequest extends TeaModel {
    /**
     * <p>The ID of the cluster to which the container belongs.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The name of the image.</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The number of entries per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetOpaClusterImageListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOpaClusterImageListRequest self = new GetOpaClusterImageListRequest();
        return TeaModel.build(map, self);
    }

    public GetOpaClusterImageListRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetOpaClusterImageListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetOpaClusterImageListRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public GetOpaClusterImageListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
