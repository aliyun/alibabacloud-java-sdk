// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceManagedResourceResponseBody extends TeaModel {
    @NameInMap("ManagedResource")
    public DescribeServiceManagedResourceResponseBodyManagedResource managedResource;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceManagedResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceManagedResourceResponseBody self = new DescribeServiceManagedResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceManagedResourceResponseBody setManagedResource(DescribeServiceManagedResourceResponseBodyManagedResource managedResource) {
        this.managedResource = managedResource;
        return this;
    }
    public DescribeServiceManagedResourceResponseBodyManagedResource getManagedResource() {
        return this.managedResource;
    }

    public DescribeServiceManagedResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeServiceManagedResourceResponseBodyManagedResource extends TeaModel {
        @NameInMap("DestinationRules")
        public java.util.List<String> destinationRules;

        @NameInMap("LocalRateLimiters")
        public java.util.List<String> localRateLimiters;

        @NameInMap("VirtualServices")
        public java.util.List<String> virtualServices;

        public static DescribeServiceManagedResourceResponseBodyManagedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceManagedResourceResponseBodyManagedResource self = new DescribeServiceManagedResourceResponseBodyManagedResource();
            return TeaModel.build(map, self);
        }

        public DescribeServiceManagedResourceResponseBodyManagedResource setDestinationRules(java.util.List<String> destinationRules) {
            this.destinationRules = destinationRules;
            return this;
        }
        public java.util.List<String> getDestinationRules() {
            return this.destinationRules;
        }

        public DescribeServiceManagedResourceResponseBodyManagedResource setLocalRateLimiters(java.util.List<String> localRateLimiters) {
            this.localRateLimiters = localRateLimiters;
            return this;
        }
        public java.util.List<String> getLocalRateLimiters() {
            return this.localRateLimiters;
        }

        public DescribeServiceManagedResourceResponseBodyManagedResource setVirtualServices(java.util.List<String> virtualServices) {
            this.virtualServices = virtualServices;
            return this;
        }
        public java.util.List<String> getVirtualServices() {
            return this.virtualServices;
        }

    }

}
