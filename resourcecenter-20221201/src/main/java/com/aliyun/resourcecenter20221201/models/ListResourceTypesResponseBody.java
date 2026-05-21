// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcecenter20221201.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E5556E4C-479A-5BBB-B325-F07563E7E917</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource types.</p>
     */
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
        /**
         * <p>The resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>cs.cluster</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>cs.cluster</p>
         */
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
        /**
         * <p>The code mapping of the resource type.</p>
         */
        @NameInMap("CodeMapping")
        public ListResourceTypesResponseBodyResourceTypesCodeMapping codeMapping;

        /**
         * <p>The supported filter conditions.</p>
         */
        @NameInMap("FilterKeys")
        public java.util.List<String> filterKeys;

        /**
         * <p>The name of the Alibaba Cloud service.</p>
         * 
         * <strong>example:</strong>
         * <p>Container Service for Kubernetes</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The name of supported related resource types.</p>
         */
        @NameInMap("RelatedResourceTypes")
        public java.util.List<String> relatedResourceTypes;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ACK::Cluster</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The name of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
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

        public ListResourceTypesResponseBodyResourceTypes setRelatedResourceTypes(java.util.List<String> relatedResourceTypes) {
            this.relatedResourceTypes = relatedResourceTypes;
            return this;
        }
        public java.util.List<String> getRelatedResourceTypes() {
            return this.relatedResourceTypes;
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
