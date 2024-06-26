// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeAvailableSpecResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeAvailableSpecResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableSpecResponseBody self = new DescribeAvailableSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableSpecResponseBody setData(DescribeAvailableSpecResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeAvailableSpecResponseBodyData getData() {
        return this.data;
    }

    public DescribeAvailableSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("Max")
        public Long max;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Min")
        public Long min;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Step")
        public Long step;

        public static DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange self = new DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange setMax(Long max) {
            this.max = max;
            return this;
        }
        public Long getMax() {
            return this.max;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange setMin(Long min) {
            this.min = min;
            return this;
        }
        public Long getMin() {
            return this.min;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4000</p>
         */
        @NameInMap("Max")
        public Long max;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Min")
        public Long min;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Step")
        public Long step;

        public static DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange self = new DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange setMax(Long max) {
            this.max = max;
            return this;
        }
        public Long getMax() {
            return this.max;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange setMin(Long min) {
            this.min = min;
            return this;
        }
        public Long getMin() {
            return this.min;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange setStep(Long step) {
            this.step = step;
            return this;
        }
        public Long getStep() {
            return this.step;
        }

    }

    public static class DescribeAvailableSpecResponseBodyDataAvailableSpecifications extends TeaModel {
        @NameInMap("DiskSizeRange")
        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange diskSizeRange;

        @NameInMap("DiskTypes")
        public java.util.List<String> diskTypes;

        /**
         * <strong>example:</strong>
         * <p>4C16GB</p>
         */
        @NameInMap("InstanceClass")
        public String instanceClass;

        @NameInMap("LogDiskSizeRange")
        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange logDiskSizeRange;

        @NameInMap("NodeNum")
        public java.util.List<Integer> nodeNum;

        /**
         * <strong>example:</strong>
         * <p>oceanbase.cluster.cd8.xlarge</p>
         */
        @NameInMap("Spec")
        public String spec;

        public static DescribeAvailableSpecResponseBodyDataAvailableSpecifications build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableSpecResponseBodyDataAvailableSpecifications self = new DescribeAvailableSpecResponseBodyDataAvailableSpecifications();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setDiskSizeRange(DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange diskSizeRange) {
            this.diskSizeRange = diskSizeRange;
            return this;
        }
        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsDiskSizeRange getDiskSizeRange() {
            return this.diskSizeRange;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setDiskTypes(java.util.List<String> diskTypes) {
            this.diskTypes = diskTypes;
            return this;
        }
        public java.util.List<String> getDiskTypes() {
            return this.diskTypes;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setInstanceClass(String instanceClass) {
            this.instanceClass = instanceClass;
            return this;
        }
        public String getInstanceClass() {
            return this.instanceClass;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setLogDiskSizeRange(DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange logDiskSizeRange) {
            this.logDiskSizeRange = logDiskSizeRange;
            return this;
        }
        public DescribeAvailableSpecResponseBodyDataAvailableSpecificationsLogDiskSizeRange getLogDiskSizeRange() {
            return this.logDiskSizeRange;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setNodeNum(java.util.List<Integer> nodeNum) {
            this.nodeNum = nodeNum;
            return this;
        }
        public java.util.List<Integer> getNodeNum() {
            return this.nodeNum;
        }

        public DescribeAvailableSpecResponseBodyDataAvailableSpecifications setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class DescribeAvailableSpecResponseBodyData extends TeaModel {
        @NameInMap("AvailableSpecifications")
        public java.util.List<DescribeAvailableSpecResponseBodyDataAvailableSpecifications> availableSpecifications;

        public static DescribeAvailableSpecResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvailableSpecResponseBodyData self = new DescribeAvailableSpecResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAvailableSpecResponseBodyData setAvailableSpecifications(java.util.List<DescribeAvailableSpecResponseBodyDataAvailableSpecifications> availableSpecifications) {
            this.availableSpecifications = availableSpecifications;
            return this;
        }
        public java.util.List<DescribeAvailableSpecResponseBodyDataAvailableSpecifications> getAvailableSpecifications() {
            return this.availableSpecifications;
        }

    }

}
