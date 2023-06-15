// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListClassesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of available instance types.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListClassesResponseBodyItems> items;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassesResponseBody self = new ListClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassesResponseBody setItems(java.util.List<ListClassesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListClassesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListClassesResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListClassesResponseBodyItems extends TeaModel {
        /**
         * <p>The code of the instance type. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~) and [Read-only ApsaraDB RDS instance types](~~145759~~).</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The instance family. For more information, see [Instance families](~~57184~~).</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The number of cores that are supported by the instance type. Unit: core.</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The size of the encrypted memory that is supported by the security-enhanced instance type. Unit: GB.</p>
         */
        @NameInMap("EncryptedMemory")
        public String encryptedMemory;

        /**
         * <p>The architecture of the instance type. Valid values:</p>
         * <br>
         * <p>*   If the architecture of the instance type is **x86**, an empty string is returned by default.</p>
         * <p>*   If the architecture of the instance type is **ARM**, **arm** is returned.</p>
         */
        @NameInMap("InstructionSetArch")
        public String instructionSetArch;

        /**
         * <p>The maximum number of connections that are supported by the instance type. Unit: core.</p>
         */
        @NameInMap("MaxConnections")
        public String maxConnections;

        /**
         * <p>The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.</p>
         */
        @NameInMap("MaxIOMBPS")
        public String maxIOMBPS;

        /**
         * <p>The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.</p>
         */
        @NameInMap("MaxIOPS")
        public String maxIOPS;

        /**
         * <p>The memory capacity that is supported by the instance type. Unit: GB.</p>
         */
        @NameInMap("MemoryClass")
        public String memoryClass;

        /**
         * <p>The fee that you must pay for the instance type.</p>
         * <br>
         * <p>*   Unit: cent (USD).</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you set **CommodityCode** to a value that indicates the pay-as-you-go billing method, the ReferencePrice parameter specifies the hourly fee that you must pay.</p>
         * <br>
         * <p>*   If you set **CommodityCode** to a value that indicates the subscription billing method, the ReferencePrice parameter specifies the monthly fee that you must pay.</p>
         */
        @NameInMap("ReferencePrice")
        public String referencePrice;

        public static ListClassesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListClassesResponseBodyItems self = new ListClassesResponseBodyItems();
            return TeaModel.build(map, self);
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

        public ListClassesResponseBodyItems setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public String getCpu() {
            return this.cpu;
        }

        public ListClassesResponseBodyItems setEncryptedMemory(String encryptedMemory) {
            this.encryptedMemory = encryptedMemory;
            return this;
        }
        public String getEncryptedMemory() {
            return this.encryptedMemory;
        }

        public ListClassesResponseBodyItems setInstructionSetArch(String instructionSetArch) {
            this.instructionSetArch = instructionSetArch;
            return this;
        }
        public String getInstructionSetArch() {
            return this.instructionSetArch;
        }

        public ListClassesResponseBodyItems setMaxConnections(String maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public String getMaxConnections() {
            return this.maxConnections;
        }

        public ListClassesResponseBodyItems setMaxIOMBPS(String maxIOMBPS) {
            this.maxIOMBPS = maxIOMBPS;
            return this;
        }
        public String getMaxIOMBPS() {
            return this.maxIOMBPS;
        }

        public ListClassesResponseBodyItems setMaxIOPS(String maxIOPS) {
            this.maxIOPS = maxIOPS;
            return this;
        }
        public String getMaxIOPS() {
            return this.maxIOPS;
        }

        public ListClassesResponseBodyItems setMemoryClass(String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        public String getMemoryClass() {
            return this.memoryClass;
        }

        public ListClassesResponseBodyItems setReferencePrice(String referencePrice) {
            this.referencePrice = referencePrice;
            return this;
        }
        public String getReferencePrice() {
            return this.referencePrice;
        }

    }

}
