// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm3iugit3uw7a</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
