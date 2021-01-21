// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resources")
    public java.util.List<ListStackResourcesResponseBodyResources> resources;

    public static ListStackResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackResourcesResponseBody self = new ListStackResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackResourcesResponseBody setResources(java.util.List<ListStackResourcesResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<ListStackResourcesResponseBodyResources> getResources() {
        return this.resources;
    }

    public static class ListStackResourcesResponseBodyResources extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("LogicalResourceId")
        public String logicalResourceId;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("StackId")
        public String stackId;

        @NameInMap("PhysicalResourceId")
        public String physicalResourceId;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceDriftStatus")
        public String resourceDriftStatus;

        @NameInMap("StatusReason")
        public String statusReason;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StackName")
        public String stackName;

        public static ListStackResourcesResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            ListStackResourcesResponseBodyResources self = new ListStackResourcesResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public ListStackResourcesResponseBodyResources setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStackResourcesResponseBodyResources setLogicalResourceId(String logicalResourceId) {
            this.logicalResourceId = logicalResourceId;
            return this;
        }
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        public ListStackResourcesResponseBodyResources setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListStackResourcesResponseBodyResources setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStackResourcesResponseBodyResources setPhysicalResourceId(String physicalResourceId) {
            this.physicalResourceId = physicalResourceId;
            return this;
        }
        public String getPhysicalResourceId() {
            return this.physicalResourceId;
        }

        public ListStackResourcesResponseBodyResources setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackResourcesResponseBodyResources setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListStackResourcesResponseBodyResources setResourceDriftStatus(String resourceDriftStatus) {
            this.resourceDriftStatus = resourceDriftStatus;
            return this;
        }
        public String getResourceDriftStatus() {
            return this.resourceDriftStatus;
        }

        public ListStackResourcesResponseBodyResources setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListStackResourcesResponseBodyResources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStackResourcesResponseBodyResources setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

    }

}
