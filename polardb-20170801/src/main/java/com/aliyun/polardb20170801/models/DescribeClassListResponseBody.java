// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeClassListResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeClassListResponseBodyItems> items;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("ClassGroup")
        public String classGroup;

        @NameInMap("ClassTypeLevel")
        public String classTypeLevel;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("MaxConnections")
        public String maxConnections;

        @NameInMap("MaxIOPS")
        public String maxIOPS;

        @NameInMap("MemoryClass")
        public String memoryClass;

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

        public DescribeClassListResponseBodyItems setMemoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        public String getMemoryClass() {
            return this.memoryClass;
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
