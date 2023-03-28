// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Maximum value: 50.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the parent stack.</p>
     */
    @NameInMap("ParentStackId")
    public String parentStackId;

    /**
     * <p>The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see the "Resource Group" section of the [What is Resource Management?](~~94475~~) topic.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to return nested stacks. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>> If the ParentStackId parameter is specified, you must set the ShowNestedStack parameter to true.</p>
     */
    @NameInMap("ShowNestedStack")
    public Boolean showNestedStack;

    /**
     * <p>The ID of the stack. If you want to query the basic information about the stack, you can use this parameter and do not need to call the GetStack operation.</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The ID of stack N.</p>
     */
    @NameInMap("StackIds")
    public java.util.List<String> stackIds;

    /**
     * <p>The name of stack N.</p>
     */
    @NameInMap("StackName")
    public java.util.List<String> stackName;

    /**
     * <p>The state N of the stack.</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListStacksRequestTag> tag;

    public static ListStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStacksRequest self = new ListStacksRequest();
        return TeaModel.build(map, self);
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
         * <p>The key of tag N of the stack.</p>
         * <br>
         * <p>Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the stack.</p>
         * <br>
         * <p>Valid values of N: 1 to 20.</p>
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
