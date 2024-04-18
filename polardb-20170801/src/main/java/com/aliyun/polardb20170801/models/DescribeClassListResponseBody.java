// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeClassListResponseBody extends TeaModel {
    /**
     * <p>The specifications of the cluster.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeClassListResponseBodyItems> items;

    /**
     * <p>The region ID of the cluster.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClassListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassListResponseBody self = new DescribeClassListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClassListResponseBody setItems(java.util.List<DescribeClassListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeClassListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeClassListResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClassListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClassListResponseBodyItems extends TeaModel {
        /**
         * <p>The specifications of the cluster.</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The instance family of the cluster. Valid values:</p>
         * <br>
         * <p>*   Exclusive package: dedicated</p>
         * <p>*   Exclusive physical machine: dedicated host</p>
         * <p>*   Beginner: starter</p>
         * <p>*   Historical specifications: historical</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The specification type of the cluster.</p>
         */
        @NameInMap("ClassTypeLevel")
        public String classTypeLevel;

        /**
         * <p>The number of vCPU cores. Unit: cores.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The maximum number of concurrent connections in the cluster.</p>
         */
        @NameInMap("MaxConnections")
        public String maxConnections;

        /**
         * <p>The maximum IOPS. Unit: operations per second.</p>
         */
        @NameInMap("MaxIOPS")
        public String maxIOPS;

        /**
         * <p>The maximum storage capacity. Unit: TB.</p>
         */
        @NameInMap("MaxStorageCapacity")
        public String maxStorageCapacity;

        /**
         * <p>The memory size. Unit: GB.</p>
         */
        @NameInMap("MemoryClass")
        public String memoryClass;

        /**
         * <p>The maximum IOPS of an enhanced SSD (ESSD) of performance level 1 (PL1). Unit: operations per second.</p>
         */
        @NameInMap("Pl1MaxIOPS")
        public String pl1MaxIOPS;

        /**
         * <p>The maximum IOPS of an ESSD of performance level 2 (PL2). Unit: operations per second.</p>
         */
        @NameInMap("Pl2MaxIOPS")
        public String pl2MaxIOPS;

        /**
         * <p>The maximum IOPS of an ESSD of performance level 3 (PL3). Unit: operations per second.</p>
         */
        @NameInMap("Pl3MaxIOPS")
        public String pl3MaxIOPS;

        /**
         * <p>The maximum Input/output operations per second (IOPS) for PolarStore Level 4 (PSL4). Unit: operations per second.</p>
         */
        @NameInMap("Psl4MaxIOPS")
        public String psl4MaxIOPS;

        /**
         * <p>The maximum IOPS for PolarStore Level 5 (PSL5). Unit: operations per second.</p>
         */
        @NameInMap("Psl5MaxIOPS")
        public String psl5MaxIOPS;

        /**
         * <p>The additional price.</p>
         * <br>
         * <p>Unit: cents (USD).</p>
         * <br>
         * <p>>- If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the same as the value of ReferencePrice.</p>
         * <p>>- If you set MasterHa to cluster or single, the value of ReferenceExtPrice is the price of the single-node cluster.</p>
         */
        @NameInMap("ReferenceExtPrice")
        public String referenceExtPrice;

        /**
         * <p>The price.</p>
         * <br>
         * <p>Unit: cents (USD).</p>
         * <br>
         * <p>>- If you set CommodityCode to a commodity that uses the pay-as-you-go billing method, ReferencePrice indicates the hourly fee that you need to pay.</p>
         * <p>>- If you set CommodityCode to a commodity that uses the subscription billing method, ReferencePrice indicates the monthly fee that you need to pay.</p>
         */
        @NameInMap("ReferencePrice")
        public String referencePrice;

        public static DescribeClassListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeClassListResponseBodyItems self = new DescribeClassListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeClassListResponseBodyItems setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public DescribeClassListResponseBodyItems setClassGroup(String classGroup) {
            this.classGroup = classGroup;
            return this;
        }
        public String getClassGroup() {
            return this.classGroup;
        }

        public DescribeClassListResponseBodyItems setClassTypeLevel(String classTypeLevel) {
            this.classTypeLevel = classTypeLevel;
            return this;
        }
        public String getClassTypeLevel() {
            return this.classTypeLevel;
        }

        public DescribeClassListResponseBodyItems setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public DescribeClassListResponseBodyItems setMaxConnections(String maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public String getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeClassListResponseBodyItems setMaxIOPS(String maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public String getMaxIOPS() {
            return this.maxIOPS;
        }

        public DescribeClassListResponseBodyItems setMaxStorageCapacity(String maxStorageCapacity) {
            this.maxStorageCapacity = maxStorageCapacity;
            return this;
        }
        public String getMaxStorageCapacity() {
            return this.maxStorageCapacity;
        }

        public DescribeClassListResponseBodyItems setMemoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        public String getMemoryClass() {
            return this.memoryClass;
        }

        public DescribeClassListResponseBodyItems setPl1MaxIOPS(String pl1MaxIOPS) {
            this.pl1MaxIOPS = pl1MaxIOPS;
            return this;
        }
        public String getPl1MaxIOPS() {
            return this.pl1MaxIOPS;
        }

        public DescribeClassListResponseBodyItems setPl2MaxIOPS(String pl2MaxIOPS) {
            this.pl2MaxIOPS = pl2MaxIOPS;
            return this;
        }
        public String getPl2MaxIOPS() {
            return this.pl2MaxIOPS;
        }

        public DescribeClassListResponseBodyItems setPl3MaxIOPS(String pl3MaxIOPS) {
            this.pl3MaxIOPS = pl3MaxIOPS;
            return this;
        }
        public String getPl3MaxIOPS() {
            return this.pl3MaxIOPS;
        }

        public DescribeClassListResponseBodyItems setPsl4MaxIOPS(String psl4MaxIOPS) {
            this.psl4MaxIOPS = psl4MaxIOPS;
            return this;
        }
        public String getPsl4MaxIOPS() {
            return this.psl4MaxIOPS;
        }

        public DescribeClassListResponseBodyItems setPsl5MaxIOPS(String psl5MaxIOPS) {
            this.psl5MaxIOPS = psl5MaxIOPS;
            return this;
        }
        public String getPsl5MaxIOPS() {
            return this.psl5MaxIOPS;
        }

        public DescribeClassListResponseBodyItems setReferenceExtPrice(String referenceExtPrice) {
            this.referenceExtPrice = referenceExtPrice;
            return this;
        }
        public String getReferenceExtPrice() {
            return this.referenceExtPrice;
        }

        public DescribeClassListResponseBodyItems setReferencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
            return this;
        }
        public String getReferencePrice() {
            return this.referencePrice;
        }

    }

}
