// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingDataPackagesRequest extends TeaModel {
    /**
     * <p>The category. Valid values:</p>
     * <ul>
     * <li>Package: package</li>
     * <li>Baseline: baseline</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Baseline</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The ID of the data package.</p>
     * 
     * <strong>example:</strong>
     * <p>dp-449ea3d16c0841b8bf33ec5bbc86a152</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <p>The start time of the time range filter. The time is displayed in UTC and follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-24T03:30:46Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The size of the data package.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>The start time of the time range filter. The time is displayed in UTC and follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-30T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the data package. Valid values:</p>
     * <ul>
     * <li>available: available for binding</li>
     * <li>packing: in progress</li>
     * <li>failed: failed</li>
     * <li>bonded: bound</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>available</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListRenderingDataPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingDataPackagesRequest self = new ListRenderingDataPackagesRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingDataPackagesRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ListRenderingDataPackagesRequest setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public ListRenderingDataPackagesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
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

    public ListRenderingDataPackagesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRenderingDataPackagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
