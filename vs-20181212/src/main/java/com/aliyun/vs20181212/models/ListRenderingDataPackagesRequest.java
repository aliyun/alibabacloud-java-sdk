// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingDataPackagesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListRenderingDataPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingDataPackagesRequest self = new ListRenderingDataPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingDataPackagesRequest setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public ListRenderingDataPackagesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingDataPackagesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRenderingDataPackagesRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListRenderingDataPackagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
