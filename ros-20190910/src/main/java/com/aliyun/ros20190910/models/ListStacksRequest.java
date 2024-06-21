// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListStacksRequest extends TeaModel {
    /**
     * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-01T15:16:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number.</p>
     * <p>Pages start from page 1.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * <p>Maximum value: 50.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the parent stack.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("ParentStackId")
    public String parentStackId;

    /**
     * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.\
     * For more information about resource groups, see the &quot;Resource Group&quot; section of the <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a> topic.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to return nested stacks. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false (default)</li>
     * </ul>
     * <blockquote>
     * <p>If you specify ParentStackId, you must set ShowNestedStack to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowNestedStack")
    public Boolean showNestedStack;

    /**
     * <p>The stack ID. You can specify this parameter to query only the stack ID. If you want to query the detailed information about the stack, call the GetStack operation.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <p>The IDs of the stacks.</p>
     */
    @NameInMap("StackIds")
    public java.util.List<String> stackIds;

    /**
     * <p>The names of the stacks.</p>
     * 
     * <strong>example:</strong>
     * <p>MyStack</p>
     */
    @NameInMap("StackName")
    public java.util.List<String> stackName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-01T15:10:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The status of the stack.</p>
     * 
     * <strong>example:</strong>
     * <p>CREATE_COMPLETE</p>
     */
    @NameInMap("Status")
    public java.util.List<String> status;

    /**
     * <p>The tags of the stack.</p>
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
         * <p>The key of tag N.\
         * Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>usage</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N.\
         * Valid values of N: 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
