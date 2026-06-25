// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The name of the Outbound Bot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The resource group ID.</p>
     * <blockquote>
     * <p>You can obtain the source API from the Resource Management documentation. For more information, see: <a href="https://api.aliyun.com/document/ResourceManager/2020-03-31/ListResourceGroups">https://api.aliyun.com/document/ResourceManager/2020-03-31/ListResourceGroups</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3iugit3uw7a</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags for the service instances.</p>
     * <blockquote>
     * <p>You can call the ListResourceTags operation to obtain tags.</p>
     * </blockquote>
     */
    @NameInMap("Tag")
    public java.util.List<ListInstancesRequestTag> tag;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public ListInstancesRequest setTag(java.util.List<ListInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTag self = new ListInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
