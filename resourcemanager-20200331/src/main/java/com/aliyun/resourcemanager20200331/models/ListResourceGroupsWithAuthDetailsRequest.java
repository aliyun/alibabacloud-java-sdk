// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupsWithAuthDetailsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TestRG-BVT1</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IncludeTags")
    public Boolean includeTags;

    /**
     * <strong>example:</strong>
     * <p>prod-rg</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupIds")
    public java.util.List<String> resourceGroupIds;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("ResourceRegionId")
    public String resourceRegionId;

    @NameInMap("ResourceTypes")
    public java.util.List<ListResourceGroupsWithAuthDetailsRequestResourceTypes> resourceTypes;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public java.util.List<ListResourceGroupsWithAuthDetailsRequestTag> tag;

    public static ListResourceGroupsWithAuthDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsWithAuthDetailsRequest self = new ListResourceGroupsWithAuthDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsWithAuthDetailsRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ListResourceGroupsWithAuthDetailsRequest setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }
    public Boolean getIncludeTags() {
        return this.includeTags;
    }

    public ListResourceGroupsWithAuthDetailsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListResourceGroupsWithAuthDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceGroupsWithAuthDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceGroupsWithAuthDetailsRequest setResourceGroupIds(java.util.List<String> resourceGroupIds) {
        this.resourceGroupIds = resourceGroupIds;
        return this;
    }
    public java.util.List<String> getResourceGroupIds() {
        return this.resourceGroupIds;
    }

    public ListResourceGroupsWithAuthDetailsRequest setResourceRegionId(String resourceRegionId) {
        this.resourceRegionId = resourceRegionId;
        return this;
    }
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    public ListResourceGroupsWithAuthDetailsRequest setResourceTypes(java.util.List<ListResourceGroupsWithAuthDetailsRequestResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourceGroupsWithAuthDetailsRequestResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourceGroupsWithAuthDetailsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListResourceGroupsWithAuthDetailsRequest setTag(java.util.List<ListResourceGroupsWithAuthDetailsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListResourceGroupsWithAuthDetailsRequestTag> getTag() {
        return this.tag;
    }

    public static class ListResourceGroupsWithAuthDetailsRequestResourceTypes extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        public static ListResourceGroupsWithAuthDetailsRequestResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsRequestResourceTypes self = new ListResourceGroupsWithAuthDetailsRequestResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsRequestResourceTypes setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public ListResourceGroupsWithAuthDetailsRequestResourceTypes setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

    }

    public static class ListResourceGroupsWithAuthDetailsRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>k1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListResourceGroupsWithAuthDetailsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupsWithAuthDetailsRequestTag self = new ListResourceGroupsWithAuthDetailsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupsWithAuthDetailsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListResourceGroupsWithAuthDetailsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
