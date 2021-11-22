// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StackGroups")
    public java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListStackGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStackGroupsResponseBody self = new ListStackGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStackGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStackGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStackGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStackGroupsResponseBody setStackGroups(java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups) {
        this.stackGroups = stackGroups;
        return this;
    }
    public java.util.List<ListStackGroupsResponseBodyStackGroups> getStackGroups() {
        return this.stackGroups;
    }

    public ListStackGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStackGroupsResponseBodyStackGroupsAutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
        public Boolean retainStacksOnAccountRemoval;

        public static ListStackGroupsResponseBodyStackGroupsAutoDeployment build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseBodyStackGroupsAutoDeployment self = new ListStackGroupsResponseBodyStackGroupsAutoDeployment();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsResponseBodyStackGroupsAutoDeployment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListStackGroupsResponseBodyStackGroupsAutoDeployment setRetainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
            this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
            return this;
        }
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

    }

    public static class ListStackGroupsResponseBodyStackGroups extends TeaModel {
        @NameInMap("AutoDeployment")
        public ListStackGroupsResponseBodyStackGroupsAutoDeployment autoDeployment;

        @NameInMap("Description")
        public String description;

        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        @NameInMap("PermissionModel")
        public String permissionModel;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        @NameInMap("StackGroupId")
        public String stackGroupId;

        @NameInMap("StackGroupName")
        public String stackGroupName;

        @NameInMap("Status")
        public String status;

        public static ListStackGroupsResponseBodyStackGroups build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseBodyStackGroups self = new ListStackGroupsResponseBodyStackGroups();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsResponseBodyStackGroups setAutoDeployment(ListStackGroupsResponseBodyStackGroupsAutoDeployment autoDeployment) {
            this.autoDeployment = autoDeployment;
            return this;
        }
        public ListStackGroupsResponseBodyStackGroupsAutoDeployment getAutoDeployment() {
            return this.autoDeployment;
        }

        public ListStackGroupsResponseBodyStackGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStackGroupsResponseBodyStackGroups setDriftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        public ListStackGroupsResponseBodyStackGroups setPermissionModel(String permissionModel) {
            this.permissionModel = permissionModel;
            return this;
        }
        public String getPermissionModel() {
            return this.permissionModel;
        }

        public ListStackGroupsResponseBodyStackGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupDriftStatus(String stackGroupDriftStatus) {
            this.stackGroupDriftStatus = stackGroupDriftStatus;
            return this;
        }
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupId(String stackGroupId) {
            this.stackGroupId = stackGroupId;
            return this;
        }
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        public ListStackGroupsResponseBodyStackGroups setStackGroupName(String stackGroupName) {
            this.stackGroupName = stackGroupName;
            return this;
        }
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        public ListStackGroupsResponseBodyStackGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
