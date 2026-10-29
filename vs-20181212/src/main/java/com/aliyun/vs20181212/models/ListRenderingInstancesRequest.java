// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstancesRequest extends TeaModel {
    /**
     * <p>The time range filter parameter. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-31T15:59:59Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number Settings for paging during a paged query. Starting value: 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page Settings for paging during a paged query. Valid values: 1 to 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The instance ID of the cloud application service.</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>The instance type of the cloud application service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

    /**
     * <p>The time range filter parameter. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-10-31T07:59:59Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The instance storage capacity of the cloud application service.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("StorageSize")
    public Integer storageSize;

    public static ListRenderingInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingInstancesRequest self = new ListRenderingInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRenderingInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRenderingInstancesRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListRenderingInstancesRequest setRenderingSpec(String renderingSpec) {
        this.renderingSpec = renderingSpec;
        return this;
    }
    public String getRenderingSpec() {
        return this.renderingSpec;
    }

    public ListRenderingInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRenderingInstancesRequest setStorageSize(Integer storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Integer getStorageSize() {
        return this.storageSize;
    }

}
