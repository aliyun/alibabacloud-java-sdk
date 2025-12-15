// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class ListResourceGroupCapabilityResponseBody extends TeaModel {
    @NameInMap("Capabilities")
    public java.util.List<ListResourceGroupCapabilityResponseBodyCapabilities> capabilities;

    /**
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
         * <p>instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Service")
        public String service;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportResourceGroupEvent")
        public Boolean supportResourceGroupEvent;

        public static ListResourceGroupCapabilityResponseBodyCapabilities build(java.util.Map<String, ?> map) throws Exception {
            ListResourceGroupCapabilityResponseBodyCapabilities self = new ListResourceGroupCapabilityResponseBodyCapabilities();
            return TeaModel.build(map, self);
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
