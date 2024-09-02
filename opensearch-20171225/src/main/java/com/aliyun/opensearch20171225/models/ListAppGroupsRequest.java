// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListAppGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the instance. Exact match is used.</p>
     * 
     * <strong>example:</strong>
     * <p>ops-cn-xxxx</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>my_name</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;110123123&quot;</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The method based on which applications are sorted. Valid values:</p>
     * <ul>
     * <li>0: sorts applications in descending order by creation time.</li>
     * <li>1: sorts applications in descending order by modification time.</li>
     * </ul>
     * <p>Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("sortBy")
    public Integer sortBy;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<ListAppGroupsRequestTags> tags;

    /**
     * <p>The type of the application. Valid values:</p>
     * <ul>
     * <li>standard: a High-performance Search Edition application.</li>
     * <li>enhanced: an Industry Algorithm Edition application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("type")
    public String type;

    public static ListAppGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppGroupsRequest self = new ListAppGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAppGroupsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAppGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAppGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAppGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAppGroupsRequest setSortBy(Integer sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public Integer getSortBy() {
        return this.sortBy;
    }

    public ListAppGroupsRequest setTags(java.util.List<ListAppGroupsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListAppGroupsRequestTags> getTags() {
        return this.tags;
    }

    public ListAppGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListAppGroupsRequestTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>bar</p>
         */
        @NameInMap("value")
        public String value;

        public static ListAppGroupsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListAppGroupsRequestTags self = new ListAppGroupsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListAppGroupsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAppGroupsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
