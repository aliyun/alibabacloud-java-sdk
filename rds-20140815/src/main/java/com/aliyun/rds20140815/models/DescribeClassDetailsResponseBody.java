// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeClassDetailsResponseBody extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("ClassCode")
    public String classCode;

    @NameInMap("ClassGroup")
    public String classGroup;

    @NameInMap("Cpu")
    public String cpu;

    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    @NameInMap("InstructionSetArch")
    public String instructionSetArch;

    @NameInMap("MaxConnections")
    public String maxConnections;

    @NameInMap("MaxIOMBPS")
    public String maxIOMBPS;

    @NameInMap("MaxIOPS")
    public String maxIOPS;

    @NameInMap("MemoryClass")
    public String memoryClass;

    @NameInMap("ReferencePrice")
    public String referencePrice;

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
