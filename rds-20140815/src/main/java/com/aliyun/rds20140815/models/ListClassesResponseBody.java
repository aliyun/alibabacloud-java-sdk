// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListClassesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Items")
    public java.util.List<ListClassesResponseBodyItems> items;

    public static ListClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassesResponseBody self = new ListClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClassesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClassesResponseBody setItems(java.util.List<ListClassesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListClassesResponseBodyItems> getItems() {
        return this.items;
    }

    public static class ListClassesResponseBodyItems extends TeaModel {
        @NameInMap("MaxIOPS")
        public String maxIOPS;

        @NameInMap("Cpu")
        public String cpu;

        @NameInMap("ReferencePrice")
        public String referencePrice;

        @NameInMap("MaxConnections")
        public String maxConnections;

        @NameInMap("MemoryClass")
        public String memoryClass;

        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("ClassGroup")
        public String classGroup;

        @NameInMap("MaxIOMBPS")
        public String maxIOMBPS;

        public static ListClassesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListClassesResponseBodyItems self = new ListClassesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListClassesResponseBodyItems setMaxIOPS(String maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public String getMaxIOPS() {
            return this.maxIOPS;
        }

        public ListClassesResponseBodyItems setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListClassesResponseBodyItems setReferencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
            return this;
        }
        public String getReferencePrice() {
            return this.referencePrice;
        }

        public ListClassesResponseBodyItems setMaxConnections(String maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public String getMaxConnections() {
            return this.maxConnections;
        }

        public ListClassesResponseBodyItems setMemoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        public String getMemoryClass() {
            return this.memoryClass;
        }

        public ListClassesResponseBodyItems setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public ListClassesResponseBodyItems setClassGroup(String classGroup) {
            this.classGroup = classGroup;
            return this;
        }
        public String getClassGroup() {
            return this.classGroup;
        }

        public ListClassesResponseBodyItems setMaxIOMBPS(String maxIOMBPS) {
            this.maxIOMBPS = maxIOMBPS;
            return this;
        }
        public String getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

    }

}
