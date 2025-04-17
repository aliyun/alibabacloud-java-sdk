// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceTypesResponseBody extends TeaModel {
    /**
     * <p>The information about the instance types.</p>
     */
    @NameInMap("InstanceTypes")
    public DescribeRCInstanceTypesResponseBodyInstanceTypes instanceTypes;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRCInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceTypesResponseBody self = new DescribeRCInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceTypesResponseBody setInstanceTypes(DescribeRCInstanceTypesResponseBodyInstanceTypes instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public DescribeRCInstanceTypesResponseBodyInstanceTypes getInstanceTypes() {
        return this.instanceTypes;
    }

    public DescribeRCInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType extends TeaModel {
        /**
         * <p>The maximum number of CPU cores.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("CpuCoreCount")
        public Integer cpuCoreCount;

        /**
         * <p>The ID of the instance family.</p>
         * 
         * <strong>example:</strong>
         * <p>gn8.cm</p>
         */
        @NameInMap("InstanceTypeFamily")
        public String instanceTypeFamily;

        /**
         * <p>The instance type of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.gna8.2xlarge.8cm</p>
         */
        @NameInMap("InstanceTypeId")
        public String instanceTypeId;

        /**
         * <p>The memory size of the instance type. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("MemorySize")
        public Integer memorySize;

        public static DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType self = new DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType setCpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        public Integer getCpuCoreCount() {
            return this.cpuCoreCount;
        }

        public DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeFamily(String instanceTypeFamily) {
            this.instanceTypeFamily = instanceTypeFamily;
            return this;
        }
        public String getInstanceTypeFamily() {
            return this.instanceTypeFamily;
        }

        public DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

    }

    public static class DescribeRCInstanceTypesResponseBodyInstanceTypes extends TeaModel {
        /**
         * <p>The instance types.</p>
         */
        @NameInMap("InstanceType")
        public java.util.List<DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType;

        public static DescribeRCInstanceTypesResponseBodyInstanceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCInstanceTypesResponseBodyInstanceTypes self = new DescribeRCInstanceTypesResponseBodyInstanceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeRCInstanceTypesResponseBodyInstanceTypes setInstanceType(java.util.List<DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public java.util.List<DescribeRCInstanceTypesResponseBodyInstanceTypesInstanceType> getInstanceType() {
            return this.instanceType;
        }

    }

}
