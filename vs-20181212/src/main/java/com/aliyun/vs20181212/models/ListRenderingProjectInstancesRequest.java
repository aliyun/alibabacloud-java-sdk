// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingProjectInstancesRequest extends TeaModel {
    /**
     * <p>End time of the time range. Use ISO 8601 format in UTC. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-30T02:18:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Page number. Start from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Project ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>Cloud application service instance ID</p>
     * 
     * <strong>example:</strong>
     * <p>render-9f8c57355d224ad7beaf95e145f22111</p>
     */
    @NameInMap("RenderingInstanceId")
    public String renderingInstanceId;

    /**
     * <p>A parameter for filtering by a time range. The time must be in UTC and formatted according to the ISO 8601 standard as \<code>yyyy-MM-ddTHH:mm:ssZ\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-11-27T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Instance status. Valid values:</p>
     * <ol>
     * <li><p>Idle</p>
     * </li>
     * <li><p>Locked</p>
     * </li>
     * <li><p>InUse</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>Idle</p>
     */
    @NameInMap("State")
    public String state;

    public static ListRenderingProjectInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingProjectInstancesRequest self = new ListRenderingProjectInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListRenderingProjectInstancesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListRenderingProjectInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingProjectInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRenderingProjectInstancesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListRenderingProjectInstancesRequest setRenderingInstanceId(String renderingInstanceId) {
        this.renderingInstanceId = renderingInstanceId;
        return this;
    }
    public String getRenderingInstanceId() {
        return this.renderingInstanceId;
    }

    public ListRenderingProjectInstancesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListRenderingProjectInstancesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
