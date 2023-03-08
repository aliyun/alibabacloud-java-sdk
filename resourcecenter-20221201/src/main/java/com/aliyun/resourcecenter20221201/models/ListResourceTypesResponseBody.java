// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public static class ListResourceTypesResponseBodyResourceTypes extends TeaModel {
        @NameInMap("FilterKeys")
        public java.util.List<String> filterKeys;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("ResourceTypeName")
        public String resourceTypeName;

        public static ListResourceTypesResponseBodyResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypes self = new ListResourceTypesResponseBodyResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypes setFilterKeys(java.util.List<String> filterKeys) {
            this.filterKeys = filterKeys;
            return this;
        }
        public java.util.List<String> getFilterKeys() {
            return this.filterKeys;
        }

        public ListResourceTypesResponseBodyResourceTypes setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceTypeName(String resourceTypeName) {
            this.resourceTypeName = resourceTypeName;
            return this;
        }
        public String getResourceTypeName() {
            return this.resourceTypeName;
        }

    }

}
