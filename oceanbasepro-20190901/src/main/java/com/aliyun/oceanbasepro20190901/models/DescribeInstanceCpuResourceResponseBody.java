// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeInstanceCpuResourceResponseBody extends TeaModel {
    @NameInMap("CpuResource")
    public DescribeInstanceCpuResourceResponseBodyCpuResource cpuResource;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceCpuResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceCpuResourceResponseBody self = new DescribeInstanceCpuResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceCpuResourceResponseBody setCpuResource(DescribeInstanceCpuResourceResponseBodyCpuResource cpuResource) {
        this.cpuResource = cpuResource;
        return this;
    }
    public DescribeInstanceCpuResourceResponseBodyCpuResource getCpuResource() {
        return this.cpuResource;
    }

    public DescribeInstanceCpuResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceCpuResourceResponseBodyCpuResource extends TeaModel {
        @NameInMap("FreeCpu")
        public Integer freeCpu;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaxCreatableCpu")
        public Integer maxCreatableCpu;

        @NameInMap("MinCreatableCpu")
        public Integer minCreatableCpu;

        public static DescribeInstanceCpuResourceResponseBodyCpuResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceCpuResourceResponseBodyCpuResource self = new DescribeInstanceCpuResourceResponseBodyCpuResource();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceCpuResourceResponseBodyCpuResource setFreeCpu(Integer freeCpu) {
            this.freeCpu = freeCpu;
            return this;
        }
        public Integer getFreeCpu() {
            return this.freeCpu;
        }

        public DescribeInstanceCpuResourceResponseBodyCpuResource setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceCpuResourceResponseBodyCpuResource setMaxCreatableCpu(Integer maxCreatableCpu) {
            this.maxCreatableCpu = maxCreatableCpu;
            return this;
        }
        public Integer getMaxCreatableCpu() {
            return this.maxCreatableCpu;
        }

        public DescribeInstanceCpuResourceResponseBodyCpuResource setMinCreatableCpu(Integer minCreatableCpu) {
            this.minCreatableCpu = minCreatableCpu;
            return this;
        }
        public Integer getMinCreatableCpu() {
            return this.minCreatableCpu;
        }

    }

}
