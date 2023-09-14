// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeClassDetailsResponseBody extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition</p>
     * <p>*   **Finance**: RDS Enterprise Edition</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The code of the instance type.</p>
     */
    @NameInMap("ClassCode")
    public String classCode;

    /**
     * <p>The instance family of the instance.</p>
     */
    @NameInMap("ClassGroup")
    public String classGroup;

    /**
     * <p>The number of CPU cores that are supported by the instance type. Unit: cores.</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSDs</p>
     * <p>*   **cloud_ssd**: standard SSDs</p>
     * <p>*   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1)</p>
     * <p>*   **cloud_essd2**: ESSDs of PL2</p>
     * <p>*   **cloud_essd3**: ESSD of PL3</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The architecture of the instance.</p>
     */
    @NameInMap("InstructionSetArch")
    public String instructionSetArch;

    /**
     * <p>The maximum number of connections.</p>
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
     * <p>The memory size. Unit: GB.</p>
     */
    @NameInMap("MemoryClass")
    public String memoryClass;

    /**
     * <p>The price.</p>
     * <br>
     * <p>Unit: cents (US dollars).</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you set the CommodityCode parameter to a value that indicates the pay-as-you-go billing method, the ReferencePrice parameter specifies the hourly fee that you must pay.</p>
     * <br>
     * <p>*   If you set the CommodityCode parameter to a value that indicates the subscription billing method, the ReferencePrice parameter specifies the monthly fee that you must pay.</p>
     */
    @NameInMap("ReferencePrice")
    public String referencePrice;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClassDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClassDetailsResponseBody self = new DescribeClassDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClassDetailsResponseBody setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public DescribeClassDetailsResponseBody setClassCode(String classCode) {
        this.classCode = classCode;
        return this;
    }
    public String getClassCode() {
        return this.classCode;
    }

    public DescribeClassDetailsResponseBody setClassGroup(String classGroup) {
        this.classGroup = classGroup;
        return this;
    }
    public String getClassGroup() {
        return this.classGroup;
    }

    public DescribeClassDetailsResponseBody setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    public String getCpu() {
        return this.cpu;
    }

    public DescribeClassDetailsResponseBody setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public DescribeClassDetailsResponseBody setInstructionSetArch(String instructionSetArch) {
        this.instructionSetArch = instructionSetArch;
        return this;
    }
    public String getInstructionSetArch() {
        return this.instructionSetArch;
    }

    public DescribeClassDetailsResponseBody setMaxConnections(String maxConnections) {
        this.maxConnections = maxConnections;
        return this;
    }
    public String getMaxConnections() {
        return this.maxConnections;
    }

    public DescribeClassDetailsResponseBody setMaxIOMBPS(String maxIOMBPS) {
        this.maxIOMBPS = maxIOMBPS;
        return this;
    }
    public String getMaxIOMBPS() {
        return this.maxIOMBPS;
    }

    public DescribeClassDetailsResponseBody setMaxIOPS(String maxIOPS) {
        this.maxIOPS = maxIOPS;
        return this;
    }
    public String getMaxIOPS() {
        return this.maxIOPS;
    }

    public DescribeClassDetailsResponseBody setMemoryClass(String memoryClass) {
        this.memoryClass = memoryClass;
        return this;
    }
    public String getMemoryClass() {
        return this.memoryClass;
    }

    public DescribeClassDetailsResponseBody setReferencePrice(String referencePrice) {
        this.referencePrice = referencePrice;
        return this;
    }
    public String getReferencePrice() {
        return this.referencePrice;
    }

    public DescribeClassDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
