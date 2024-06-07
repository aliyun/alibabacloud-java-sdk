// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListTrafficControlTasksRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

    @NameInMap("ControlTargetFilter")
    public String controlTargetFilter;

    @NameInMap("Environment")
    public String environment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("Status")
    public String status;

    @NameInMap("TrafficControlTaskId")
    public String trafficControlTaskId;

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
