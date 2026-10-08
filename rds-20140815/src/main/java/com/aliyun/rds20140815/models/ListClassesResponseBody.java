// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ListClassesResponseBody extends TeaModel {
    /**
     * <p>The list of instance type information.</p>
     */
    @NameInMap("Items")
    public java.util.List<ListClassesResponseBodyItems> items;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF8D35BF-263D-4F7B-883A-1163B79A9EC6</p>
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
         * <p>The instance type code. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary instance types</a> and <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n1.micro.1</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        /**
         * <p>The instance family. For more information, see <a href="https://help.aliyun.com/document_detail/57184.html">Instance families</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>general-purpose</p>
         */
        @NameInMap("ClassGroup")
        public String classGroup;

        /**
         * <p>The number of CPU cores for the instance type. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Cpu")
        public String cpu;

        /**
         * <p>The encrypted memory size for the security-enhanced instance family. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EncryptedMemory")
        public String encryptedMemory;

        /**
         * <p>The architecture type of the instance type. Valid values:</p>
         * <ul>
         * <li>If the instance uses the <strong>x86</strong> architecture, this parameter is empty by default.</li>
         * <li>If the instance uses the <strong>arm</strong> architecture, <strong>arm</strong> is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>arm</p>
         */
        @NameInMap("InstructionSetArch")
        public String instructionSetArch;

        /**
         * <p>The maximum number of connections for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxConnections")
        public String maxConnections;

        /**
         * <p>The maximum I/O bandwidth for the instance type. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1024Mbps</p>
         */
        @NameInMap("MaxIOMBPS")
        public String maxIOMBPS;

        /**
         * <p>The maximum IOPS for the instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("MaxIOPS")
        public String maxIOPS;

        /**
         * <p>The memory size for the instance type. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1GB</p>
         */
        @NameInMap("MemoryClass")
        public String memoryClass;

        /**
         * <p>The price for the instance type.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <ul>
         * <li>Unit: cents (CNY).</li>
         * </ul>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <ul>
         * <li>Unit: cents (USD).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you set the <strong>CommodityCode</strong> parameter to a pay-as-you-go commodity code, this parameter indicates the hourly price.</li>
         * <li>If you set the <strong>CommodityCode</strong> parameter to a subscription commodity code, this parameter indicates the monthly price.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        @NameInMap("ReferencePrice")
        public String referencePrice;

        /**
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li>Regular instances<ul>
         * <li><strong>Basic</strong>: Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: High availability series.</li>
         * <li><strong>cluster</strong>: MySQL or PostgreSQL Cluster Edition.</li>
         * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
         * </ul>
         * </li>
         * <li>Serverless instances<ul>
         * <li><strong>serverless_basic</strong>: Serverless Basic Edition. (Applicable only to MySQL and PostgreSQL)</li>
         * <li><strong>serverless_standard</strong>: Serverless high availability series. (Applicable only to MySQL and PostgreSQL)</li>
         * <li><strong>serverless_ha</strong>: SQL Server Serverless high availability series.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("category")
        public String category;

        /**
         * <p>The instance storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("storageType")
        public String storageType;

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

        public ListClassesResponseBodyItems setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListClassesResponseBodyItems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
