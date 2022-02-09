// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceMemoryResourceResponseBody extends TeaModel {
    @NameInMap("MemoryResource")
    public DescribeInstanceMemoryResourceResponseBodyMemoryResource memoryResource;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceMemoryResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMemoryResourceResponseBody self = new DescribeInstanceMemoryResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMemoryResourceResponseBody setMemoryResource(DescribeInstanceMemoryResourceResponseBodyMemoryResource memoryResource) {
        this.memoryResource = memoryResource;
        return this;
    }
    public DescribeInstanceMemoryResourceResponseBodyMemoryResource getMemoryResource() {
        return this.memoryResource;
    }

    public DescribeInstanceMemoryResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceMemoryResourceResponseBodyMemoryResource extends TeaModel {
        @NameInMap("FreeMemory")
        public Integer freeMemory;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxCreatableMemory")
        public Integer maxCreatableMemory;

        @NameInMap("MinCreatableMemory")
        public Integer minCreatableMemory;

        @NameInMap("UsedMemory")
        public Integer usedMemory;

        public static DescribeInstanceMemoryResourceResponseBodyMemoryResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMemoryResourceResponseBodyMemoryResource self = new DescribeInstanceMemoryResourceResponseBodyMemoryResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMemoryResourceResponseBodyMemoryResource setFreeMemory(Integer freeMemory) {
            this.freeMemory = freeMemory;
            return this;
        }
        public Integer getFreeMemory() {
            return this.freeMemory;
        }

        public DescribeInstanceMemoryResourceResponseBodyMemoryResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMemoryResourceResponseBodyMemoryResource setMaxCreatableMemory(Integer maxCreatableMemory) {
            this.maxCreatableMemory = maxCreatableMemory;
            return this;
        }
        public Integer getMaxCreatableMemory() {
            return this.maxCreatableMemory;
        }

        public DescribeInstanceMemoryResourceResponseBodyMemoryResource setMinCreatableMemory(Integer minCreatableMemory) {
            this.minCreatableMemory = minCreatableMemory;
            return this;
        }
        public Integer getMinCreatableMemory() {
            return this.minCreatableMemory;
        }

        public DescribeInstanceMemoryResourceResponseBodyMemoryResource setUsedMemory(Integer usedMemory) {
            this.usedMemory = usedMemory;
            return this;
        }
        public Integer getUsedMemory() {
            return this.usedMemory;
        }

    }

}
