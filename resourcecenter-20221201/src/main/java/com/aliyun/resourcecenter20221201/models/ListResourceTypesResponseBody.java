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

    public static class ListResourceTypesResponseBodyResourceTypesCodeMapping extends TeaModel {
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        @NameInMap("Tag")
        public String tag;

        public static ListResourceTypesResponseBodyResourceTypesCodeMapping build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesCodeMapping self = new ListResourceTypesResponseBodyResourceTypesCodeMapping();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesCodeMapping setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ListResourceTypesResponseBodyResourceTypesCodeMapping setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypes extends TeaModel {
        @NameInMap("CodeMapping")
        public ListResourceTypesResponseBodyResourceTypesCodeMapping codeMapping;

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

        public ListResourceTypesResponseBodyResourceTypes setCodeMapping(ListResourceTypesResponseBodyResourceTypesCodeMapping codeMapping) {
            this.codeMapping = codeMapping;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesCodeMapping getCodeMapping() {
            return this.codeMapping;
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
