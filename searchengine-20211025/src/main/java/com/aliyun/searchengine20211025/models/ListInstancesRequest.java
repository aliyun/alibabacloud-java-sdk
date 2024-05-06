// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The description of the instance. You can use this description to filter instances. Fuzzy match is supported.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The Instance type, vector (vector index version),engine (recall engine version)</p>
     */
    @NameInMap("edition")
    public String edition;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 50. Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag dictionary.</p>
     */
    @NameInMap("tags")
    public java.util.List<ListInstancesRequestTags> tags;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ListInstancesRequest setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public ListInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListInstancesRequest setTags(java.util.List<ListInstancesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListInstancesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListInstancesRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("value")
        public String value;

        public static ListInstancesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTags self = new ListInstancesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
