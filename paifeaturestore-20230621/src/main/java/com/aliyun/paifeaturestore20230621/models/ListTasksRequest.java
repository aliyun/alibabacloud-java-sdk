// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The ID of the object. You can call the ListModelFeatures or ListFeatureViews operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ObjectId")
    public String objectId;

    /**
     * <p>The type of the object.</p>
     * <p>● <code>ModelFeature</code>: a model feature.</p>
     * <p>● <code>FeatureView</code>: a feature view.</p>
     * 
     * <strong>example:</strong>
     * <p>ModelFeature</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the project. You can call the ListProjects operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The task status.</p>
     * <p>● <code>Initializing</code>: The task is being initialized.</p>
     * <p>● <code>Running</code>: The task is running.</p>
     * <p>● <code>Success</code>: The task is successful.</p>
     * <p>● <code>Failure</code>: The task fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task IDs by which to filter tasks.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    /**
     * <p>The task type by which to filter tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>OfflineToOnline</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public ListTasksRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public ListTasksRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
