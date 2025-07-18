// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingInstancesRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

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
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <strong>example:</strong>
     * <p>crs.cp.l1</p>
     */
    @NameInMap("RenderingSpec")
    public String renderingSpec;

    @NameInMap("StartTime")
    public String startTime;

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
