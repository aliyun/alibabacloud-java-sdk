// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Resources")
    @Validation(required = true)
    public java.util.List<ListStackResourcesResponseResources> resources;

    public static ListStackResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesResponse self = new ListStackResourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListStackResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResourcesResponse setResources(java.util.List<ListStackResourcesResponseResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListStackResourcesResponseResources> getResources() {
        return this.resources;
    }

    public static class ListStackResourcesResponseResources extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("LogicalResourceId")
        @Validation(required = true)
        public String logicalResourceId;

        @NameInMap("PhysicalResourceId")
        @Validation(required = true)
        public String physicalResourceId;

        @NameInMap("ResourceType")
        @Validation(required = true)
        public String resourceType;

        @NameInMap("StackId")
        @Validation(required = true)
        public String stackId;

        @NameInMap("StackName")
        @Validation(required = true)
        public String stackName;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StatusReason")
        @Validation(required = true)
        public String statusReason;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public String updateTime;

        @NameInMap("ResourceDriftStatus")
        @Validation(required = true)
        public String resourceDriftStatus;

        @NameInMap("DriftDetectionTime")
        @Validation(required = true)
        public String driftDetectionTime;

        public static ListStackResourcesResponseResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourcesResponseResources self = new ListStackResourcesResponseResources();
            return TeaModel.build(map, self);
        }

        public ListStackResourcesResponseResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackResourcesResponseResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourcesResponseResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourcesResponseResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourcesResponseResources setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackResourcesResponseResources setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStackResourcesResponseResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackResourcesResponseResources setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackResourcesResponseResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListStackResourcesResponseResources setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourcesResponseResources setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

    }

}
