// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of stack groups.</p>
     */
    @NameInMap("StackGroups")
    public java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups;

    /**
     * <p>The total number of stack groups.</p>
     */
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
        /**
         * <p>Indicates whether automatic deployment is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true: Automatic deployment is enabled. If you add a member to the folder to which the stack group belongs after you enable automatic deployment, ROS automatically adds the stacks in the stack group to the specified region of the member. If you delete the member from the folder, ROS automatically deletes the stacks in the stack group from the specified region of the member.</p>
         * <p>*   false: Automatic deployment is disabled. After you disable automatic deployment, the stacks remain unchanged when you change the member in the folder.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the stacks within a member are retained when you delete the member from the folder.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         * <br>
         * <p>>  This parameter is returned only if the Enabled parameter is set to true.</p>
         */
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

    public static class ListStackGroupsResponseBodyStackGroupsTags extends TeaModel {
        /**
         * <p>The key of the tag that is added to the stack group.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is added to the stack group.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListStackGroupsResponseBodyStackGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListStackGroupsResponseBodyStackGroupsTags self = new ListStackGroupsResponseBodyStackGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListStackGroupsResponseBodyStackGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStackGroupsResponseBodyStackGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListStackGroupsResponseBodyStackGroups extends TeaModel {
        /**
         * <p>The information about automatic deployment settings.</p>
         */
        @NameInMap("AutoDeployment")
        public ListStackGroupsResponseBodyStackGroupsAutoDeployment autoDeployment;

        /**
         * <p>The description of the stack group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the last successful drift detection was performed on the stack group.</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The permission model.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   SELF_MANAGED: self-managed permission model</p>
         * <p>*   SERVICE_MANAGED: service-managed permission model</p>
         * <br>
         * <p>>  For more information about the permission models of stack groups, see [Overview](~~154578~~).</p>
         */
        @NameInMap("PermissionModel")
        public String permissionModel;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The state of the stack group on which the last successful drift detection was performed.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   DRIFTED: The stack group has drifted.</p>
         * <p>*   NOT_CHECKED: No drift detection is performed on the stack group.</p>
         * <p>*   IN_SYNC: No drifts are detected on the stack group.</p>
         */
        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        /**
         * <p>The ID of the stack group.</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The state of the stack group.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   ACTIVE</p>
         * <p>*   DELETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the stack group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListStackGroupsResponseBodyStackGroupsTags> tags;

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

        public ListStackGroupsResponseBodyStackGroups setTags(java.util.List<ListStackGroupsResponseBodyStackGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListStackGroupsResponseBodyStackGroupsTags> getTags() {
            return this.tags;
        }

    }

}
