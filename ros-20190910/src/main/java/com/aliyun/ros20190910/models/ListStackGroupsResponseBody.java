// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStackGroupsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The stack groups.</p>
     */
    @NameInMap("StackGroups")
    public java.util.List<ListStackGroupsResponseBodyStackGroups> stackGroups;

    /**
     * <p>The total number of stack groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Automatic deployment is enabled. If you add a member to the folder to which the stack group belongs after automatic deployment is enabled, Resource Orchestration Service (ROS) automatically adds the stack instances in the stack group to the specified region of the member. If you delete the member from the folder, ROS automatically deletes the stack instances in the stack group from the specified region of the member.</li>
         * <li>false: Automatic deployment is disabled. After you disable automatic deployment, the stack instances remain unchanged when you change the member in the folder.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the stacks within a member are retained when you delete the member from the folder.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only if Enabled is set to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>usage1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag that is added to the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
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

        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>My Stack Group</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-27T07:47:47</p>
         */
        @NameInMap("DriftDetectionTime")
        public String driftDetectionTime;

        /**
         * <p>The permission model of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>SELF_MANAGED</li>
         * <li>SERVICE_MANAGED</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the permission models of stack groups, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SELF_MANAGED</p>
         */
        @NameInMap("PermissionModel")
        public String permissionModel;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxcj****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The drift state of the stack group on which the most recent successful drift detection was performed.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>DRIFTED: The stack group has drifted.</li>
         * <li>NOT_CHECKED: No drift detection is performed on the stack group.</li>
         * <li>IN_SYNC: No drifts are detected on the stack group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        @NameInMap("StackGroupDriftStatus")
        public String stackGroupDriftStatus;

        /**
         * <p>The ID of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
         */
        @NameInMap("StackGroupId")
        public String stackGroupId;

        /**
         * <p>The name of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        @NameInMap("StackGroupName")
        public String stackGroupName;

        /**
         * <p>The state of the stack group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ACTIVE</li>
         * <li>DELETED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the stack group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListStackGroupsResponseBodyStackGroupsTags> tags;

        @NameInMap("UpdateTime")
        public String updateTime;

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

        public ListStackGroupsResponseBodyStackGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
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

        public ListStackGroupsResponseBodyStackGroups setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
