// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupCapabilityResponseBody extends TeaModel {
    /**
     * <p>Indicates whether a specific resource type or cloud service supports resource group events.</p>
     */
    @NameInMap("Capabilities")
    public java.util.List<ListResourceGroupCapabilityResponseBodyCapabilities> capabilities;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2CB870A2-DF0F-5338-8223-F64737FF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListResourceGroupCapabilityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupCapabilityResponseBody self = new ListResourceGroupCapabilityResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupCapabilityResponseBody setCapabilities(java.util.List<ListResourceGroupCapabilityResponseBodyCapabilities> capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public java.util.List<ListResourceGroupCapabilityResponseBodyCapabilities> getCapabilities() {
        return this.capabilities;
    }

    public ListResourceGroupCapabilityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListResourceGroupCapabilityResponseBodyCapabilities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceCenterResourceType")
        public String resourceCenterResourceType;

        /**
         * <p>The resource type.</p>
         * <p>You can obtain the resource type from the <strong>Resource type</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The service code.</p>
         * <p>You can obtain the code from the <strong>Service code</strong> column in <a href="https://help.aliyun.com/document_detail/94479.html">Services that work with Resource Group</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <p>Indicates whether a specific resource type or cloud service supports resource group events.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportResourceGroupEvent")
        public Boolean supportResourceGroupEvent;

        public static ListResourceGroupCapabilityResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupCapabilityResponseBodyCapabilities self = new ListResourceGroupCapabilityResponseBodyCapabilities();
            return TeaModel.build(map, self);
        }

        public ListResourceGroupCapabilityResponseBodyCapabilities setResourceCenterResourceType(String resourceCenterResourceType) {
            this.resourceCenterResourceType = resourceCenterResourceType;
            return this;
        }
        public String getResourceCenterResourceType() {
            return this.resourceCenterResourceType;
        }

        public ListResourceGroupCapabilityResponseBodyCapabilities setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceGroupCapabilityResponseBodyCapabilities setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public ListResourceGroupCapabilityResponseBodyCapabilities setSupportResourceGroupEvent(Boolean supportResourceGroupEvent) {
            this.supportResourceGroupEvent = supportResourceGroupEvent;
            return this;
        }
        public Boolean getSupportResourceGroupEvent() {
            return this.supportResourceGroupEvent;
        }

    }

}
