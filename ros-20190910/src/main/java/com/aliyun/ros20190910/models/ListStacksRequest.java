// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksRequest extends TeaModel {
    /**
     * <p>The reason why the stack is in its current state.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The state N of the stack. Valid values:</p>
     * <br>
     * <p>*   CREATE_IN_PROGRESS: The stack is being created.</p>
     * <p>*   CREATE_FAILED: The stack fails to be created.</p>
     * <p>*   CREATE_COMPLETE: The stack is created.</p>
     * <p>*   UPDATE_IN_PROGRESS: The stack is being updated.</p>
     * <p>*   UPDATE_FAILED: The stack fails to be updated.</p>
     * <p>*   UPDATE_COMPLETE: The stack is updated.</p>
     * <p>*   DELETE_IN_PROGRESS: The stack is being deleted.</p>
     * <p>*   DELETE_FAILED: The stack fails to be deleted.</p>
     * <p>*   CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be created.</p>
     * <p>*   CREATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be created.</p>
     * <p>*   CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be created.</p>
     * <p>*   ROLLBACK_IN_PROGRESS: The resources of the stack are being rolled back.</p>
     * <p>*   ROLLBACK_FAILED: The resources of the stack fail to be rolled back.</p>
     * <p>*   ROLLBACK_COMPLETE: The resources of the stack are rolled back.</p>
     * <p>*   CHECK_IN_PROGRESS: The stack is being validated.</p>
     * <p>*   CHECK_FAILED: The stack fails to be validated.</p>
     * <p>*   CHECK_COMPLETE: The stack is validated.</p>
     * <p>*   REVIEW_IN_PROGRESS: The stack is being reviewed.</p>
     * <p>*   IMPORT_CREATE_IN_PROGRESS: The stack is being created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_FAILED: The stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_COMPLETE: The stack is created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be created by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_IN_PROGRESS: The stack is being updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_FAILED: The stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_COMPLETE: The stack is updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be updated by using imported resources.</p>
     * <p>*   IMPORT_UPDATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be updated by using imported resources.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The name of stack N.</p>
     */
    @NameInMap("ParentStackId")
    public String parentStackId;

    /**
     * <p>The name of stack N.</p>
     * <br>
     * <p>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter. You can use the wildcard character (∗) for fuzzy search.</p>
     * <br>
     * <p>Valid values of N: 1 to 5.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of stacks.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The key of tag N of the stack.</p>
     * <br>
     * <p>Valid values of N: 1 to 20.</p>
     */
    @NameInMap("ShowNestedStack")
    public Boolean showNestedStack;

    /**
     * <p>The value of tag N of the stack.</p>
     * <br>
     * <p>Valid values of N: 1 to 20.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The state of the stack.</p>
     */
    @NameInMap("StackIds")
    public java.util.List<String> stackIds;

    /**
     * <p>The ID of stack N.</p>
     * <br>
     * <p>You can specify one or more IDs to query one or more stacks at the same time.</p>
     * <br>
     * <p>Valid values of N: 1 to 10.</p>
     */
    @NameInMap("StackName")
    public java.util.List<String> stackName;

    /**
     * <p>The time when the last successful drift detection was performed on the stack.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see the "Resource Group" section of the [What is Resource Management?](~~94475~~) topic.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The number of entries returned per page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListStacksRequestTag> tag;

    public static ListStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStacksRequest self = new ListStacksRequest();
        return TeaModel.build(map, self);
    }

    public ListStacksRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListStacksRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListStacksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListStacksRequest setParentStackId(String parentStackId) {
        this.parentStackId = parentStackId;
        return this;
    }
    public String getParentStackId() {
        return this.parentStackId;
    }

    public ListStacksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListStacksRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListStacksRequest setShowNestedStack(Boolean showNestedStack) {
        this.showNestedStack = showNestedStack;
        return this;
    }
    public Boolean getShowNestedStack() {
        return this.showNestedStack;
    }

    public ListStacksRequest setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public ListStacksRequest setStackIds(java.util.List<String> stackIds) {
        this.stackIds = stackIds;
        return this;
    }
    public java.util.List<String> getStackIds() {
        return this.stackIds;
    }

    public ListStacksRequest setStackName(java.util.List<String> stackName) {
        this.stackName = stackName;
        return this;
    }
    public java.util.List<String> getStackName() {
        return this.stackName;
    }

    public ListStacksRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListStacksRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListStacksRequest setTag(java.util.List<ListStacksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListStacksRequestTag> getTag() {
        return this.tag;
    }

    public static class ListStacksRequestTag extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListStacksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListStacksRequestTag self = new ListStacksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListStacksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListStacksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
