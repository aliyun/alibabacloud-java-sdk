// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceResponseBody extends TeaModel {
    /**
     * <p>The zones and the supported resources.</p>
     */
    @NameInMap("AvailableResources")
    public DescribeAvailableResourceResponseBodyAvailableResources availableResources;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceResponseBody self = new DescribeAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceResponseBody setAvailableResources(DescribeAvailableResourceResponseBodyAvailableResources availableResources) {
        this.availableResources = availableResources;
        return this;
    }
    public DescribeAvailableResourceResponseBodyAvailableResources getAvailableResources() {
        return this.availableResources;
    }

    public DescribeAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource extends TeaModel {
        /**
         * <p>The type of the IP address.</p>
         * <br>
         * <p>Valid values: **ipv4 and ipv6**.</p>
         */
        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        /**
         * <p>The network type.</p>
         * <br>
         * <p>Valid values: **vpc, classic-internet, and classic-intranet**.</p>
         */
        @NameInMap("AddressType")
        public String addressType;

        public static DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource self = new DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource setAddressType(String addressType) {
            this.addressType = addressType;
            return this;
        }
        public String getAddressType() {
            return this.addressType;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource> supportResource;

        public static DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources self = new DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources setSupportResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource extends TeaModel {
        /**
         * <p>The primary zone.</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The secondary zone.</p>
         */
        @NameInMap("SlaveZoneId")
        public String slaveZoneId;

        /**
         * <p>The supported resources.</p>
         */
        @NameInMap("SupportResources")
        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources supportResources;

        public static DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource self = new DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource setSlaveZoneId(String slaveZoneId) {
            this.slaveZoneId = slaveZoneId;
            return this;
        }
        public String getSlaveZoneId() {
            return this.slaveZoneId;
        }

        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource setSupportResources(DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources supportResources) {
            this.supportResources = supportResources;
            return this;
        }
        public DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResourceSupportResources getSupportResources() {
            return this.supportResources;
        }

    }

    public static class DescribeAvailableResourceResponseBodyAvailableResources extends TeaModel {
        @NameInMap("AvailableResource")
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource> availableResource;

        public static DescribeAvailableResourceResponseBodyAvailableResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableResourceResponseBodyAvailableResources self = new DescribeAvailableResourceResponseBodyAvailableResources();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableResourceResponseBodyAvailableResources setAvailableResource(java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource> availableResource) {
            this.availableResource = availableResource;
            return this;
        }
        public java.util.List<DescribeAvailableResourceResponseBodyAvailableResourcesAvailableResource> getAvailableResource() {
            return this.availableResource;
        }

    }

}
