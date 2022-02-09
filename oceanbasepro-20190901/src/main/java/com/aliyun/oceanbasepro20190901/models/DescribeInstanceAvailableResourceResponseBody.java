// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceAvailableResourceResponseBody extends TeaModel {
    @NameInMap("AvailableResource")
    public DescribeInstanceAvailableResourceResponseBodyAvailableResource availableResource;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceAvailableResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceAvailableResourceResponseBody self = new DescribeInstanceAvailableResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceAvailableResourceResponseBody setAvailableResource(DescribeInstanceAvailableResourceResponseBodyAvailableResource availableResource) {
        this.availableResource = availableResource;
        return this;
    }
    public DescribeInstanceAvailableResourceResponseBodyAvailableResource getAvailableResource() {
        return this.availableResource;
    }

    public DescribeInstanceAvailableResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceAvailableResourceResponseBodyAvailableResource extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxCpu")
        public Integer maxCpu;

        @NameInMap("MaxMemory")
        public Integer maxMemory;

        @NameInMap("MinCpu")
        public Integer minCpu;

        @NameInMap("MinMemory")
        public Integer minMemory;

        public static DescribeInstanceAvailableResourceResponseBodyAvailableResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceAvailableResourceResponseBodyAvailableResource self = new DescribeInstanceAvailableResourceResponseBodyAvailableResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceAvailableResourceResponseBodyAvailableResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceAvailableResourceResponseBodyAvailableResource setMaxCpu(Integer maxCpu) {
            this.maxCpu = maxCpu;
            return this;
        }
        public Integer getMaxCpu() {
            return this.maxCpu;
        }

        public DescribeInstanceAvailableResourceResponseBodyAvailableResource setMaxMemory(Integer maxMemory) {
            this.maxMemory = maxMemory;
            return this;
        }
        public Integer getMaxMemory() {
            return this.maxMemory;
        }

        public DescribeInstanceAvailableResourceResponseBodyAvailableResource setMinCpu(Integer minCpu) {
            this.minCpu = minCpu;
            return this;
        }
        public Integer getMinCpu() {
            return this.minCpu;
        }

        public DescribeInstanceAvailableResourceResponseBodyAvailableResource setMinMemory(Integer minMemory) {
            this.minMemory = minMemory;
            return this;
        }
        public Integer getMinMemory() {
            return this.minMemory;
        }

    }

}
