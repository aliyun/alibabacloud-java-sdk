// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTasksRequest extends TeaModel {
    /**
     * <p>Specifies whether to return all results without pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

    /**
     * <p>The filter for traffic control targets. Valid values:</p>
     * <ul>
     * <li><p><code>All</code>: Returns all traffic control targets.</p>
     * </li>
     * <li><p><code>Valid</code>: Returns only active traffic control targets. A traffic control target is active if the current time is within the specified start and end time.</p>
     * </li>
     * <li><p><code>None</code>: Does not return any traffic control targets.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("ControlTargetFilter")
    public String controlTargetFilter;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><p><code>Daily</code>: the daily environment</p>
     * </li>
     * <li><p><code>Pre</code>: the pre-production environment</p>
     * </li>
     * <li><p><code>Prod</code>: the production environment</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pre</p>
     */
    @NameInMap("Environment")
    public String environment;

    /**
     * <p>The instance ID. You can obtain this ID by calling the <a href="https://icms.alibaba-inc.com/content/learn/pai?l=1%5C&m=16768%5C&n=4300782">ListInstances</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>pairec-cn-********</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>task_1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><code>ASC</code>: ascending order</p>
     * </li>
     * <li><p><code>DESC</code>: descending order</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the scene. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2402581.html">ListScenes</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><p><code>GmtCreateTime</code>: Sorts the results by creation time.</p>
     * </li>
     * <li><p><code>GmtModifiedTime</code>: Sorts the results by modification time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>GmtCreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><p><code>NotRunning</code>: The task is not running.</p>
     * </li>
     * <li><p><code>Ready</code>: The task is ready to run.</p>
     * </li>
     * <li><p><code>Running</code>: The task is running.</p>
     * </li>
     * <li><p><code>Finished</code>: The task is finished.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the traffic control task.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

    /**
     * <p>The version. Valid values:</p>
     * <ul>
     * <li><p><code>Latest</code>: The latest version. This is the default value.</p>
     * </li>
     * <li><p><code>Released</code>: the released version</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Latest</p>
     */
    @NameInMap("Version")
    public String version;

    public static ListTrafficControlTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTrafficControlTasksRequest self = new ListTrafficControlTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTrafficControlTasksRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListTrafficControlTasksRequest setControlTargetFilter(String controlTargetFilter) {
        this.controlTargetFilter = controlTargetFilter;
        return this;
    }
    public String getControlTargetFilter() {
        return this.controlTargetFilter;
    }

    public ListTrafficControlTasksRequest setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
    public String getEnvironment() {
        return this.environment;
    }

    public ListTrafficControlTasksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTrafficControlTasksRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListTrafficControlTasksRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListTrafficControlTasksRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListTrafficControlTasksRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListTrafficControlTasksRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public ListTrafficControlTasksRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListTrafficControlTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTrafficControlTasksRequest setTrafficControlTaskId(String trafficControlTaskId) {
        this.trafficControlTaskId = trafficControlTaskId;
        return this;
    }
    public String getTrafficControlTaskId() {
        return this.trafficControlTaskId;
    }

    public ListTrafficControlTasksRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
