// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeClassDetailsResponseBody extends TeaModel {
    /**
     * <p>The edition. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: High-availability Edition</li>
     * <li><strong>AlwaysOn</strong>: Cluster Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Basic</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The instance type code.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.n2.medium.1</p>
     */
    @NameInMap("ClassCode")
    public String classCode;

    /**
     * <p>The instance family.</p>
     * 
     * <strong>example:</strong>
     * <p>x</p>
     */
    @NameInMap("ClassGroup")
    public String classGroup;

    /**
     * <p>The number of CPU cores for the instance type. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Cpu")
    public String cpu;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The architecture.</p>
     * 
     * <strong>example:</strong>
     * <p>x86</p>
     */
    @NameInMap("InstructionSetArch")
    public String instructionSetArch;

    /**
     * <p>The maximum number of connections.</p>
     * 
     * <strong>example:</strong>
     * <p>4000</p>
     */
    @NameInMap("MaxConnections")
    public String maxConnections;

    /**
     * <p>The maximum I/O bandwidth for the instance type. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("MaxIOMBPS")
    public String maxIOMBPS;

    /**
     * <p>The maximum IOPS for the instance type. Unit: operations per second.</p>
     * 
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("MaxIOPS")
    public String maxIOPS;

    /**
     * <p>The memory capacity. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>2GB</p>
     */
    @NameInMap("MemoryClass")
    public String memoryClass;

    /**
     * <p>The price.</p>
     * <p>&lt;props=&quot;china&quot;&gt;Unit: cents (CNY).
     * &lt;props=&quot;intl&quot;&gt;Unit: cents (USD).</p>
     * <blockquote>
     * <ul>
     * <li>If you set the CommodityCode parameter to a pay-as-you-go commodity code, the hourly price is returned.</li>
     * <li>If you set the CommodityCode parameter to a subscription commodity code, the monthly price is returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13400</p>
     */
    @NameInMap("ReferencePrice")
    public String referencePrice;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E9DD55F4-1A5F-48CA-BA57-DFB3CA8C4C34</p>
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
