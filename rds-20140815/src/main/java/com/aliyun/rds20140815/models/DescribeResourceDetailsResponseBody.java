// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceDetailsResponseBody extends TeaModel {
    /**
     * <p>The storage that is occupied by data backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
     */
    @NameInMap("BackupDataSize")
    public Long backupDataSize;

    /**
     * <p>The storage that is occupied by log backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
     */
    @NameInMap("BackupLogSize")
    public Long backupLogSize;

    /**
     * <p>The storage that is used to store backup files. Unit: bytes. The value -1 indicates that no backup files are stored.</p>
     */
    @NameInMap("BackupSize")
    public Long backupSize;

    /**
     * <p>Database Storage.</p>
     */
    @NameInMap("DbInstanceStorage")
    public Long dbInstanceStorage;

    /**
     * <p>ProxyInstance name.</p>
     */
    @NameInMap("DbProxyInstanceName")
    public String dbProxyInstanceName;

    /**
     * <p>The total storage that is occupied by data files and log files on the instance. Unit: bytes. The value -1 indicates that no data files or log files are stored on the instance.</p>
     */
    @NameInMap("DiskUsed")
    public Long diskUsed;

    /**
     * <p>Instance StorageType</p>
     */
    @NameInMap("InstanceStorageType")
    public String instanceStorageType;

    /**
     * <p>Whitelist Rules.</p>
     */
    @NameInMap("RdsEcsSecurityGroupRel")
    public java.util.List<DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

    /**
     * <p>The region ID of the instance.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist of the serverless instance. For more information, see [Use a database client or the CLI to connect to an ApsaraDB RDS for PostgreSQL instance](~~43185~~). If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. You can specify up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
     * <br>
     * <p>*   IP addresses, such as 10.10.XX.XX.</p>
     * <p>*   CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</p>
     * <br>
     * <p>If this parameter is not specified, the default IP address whitelist is used.</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The vSwitch ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID。</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeResourceDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceDetailsResponseBody self = new DescribeResourceDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceDetailsResponseBody setBackupDataSize(Long backupDataSize) {
        this.backupDataSize = backupDataSize;
        return this;
    }
    public Long getBackupDataSize() {
        return this.backupDataSize;
    }

    public DescribeResourceDetailsResponseBody setBackupLogSize(Long backupLogSize) {
        this.backupLogSize = backupLogSize;
        return this;
    }
    public Long getBackupLogSize() {
        return this.backupLogSize;
    }

    public DescribeResourceDetailsResponseBody setBackupSize(Long backupSize) {
        this.backupSize = backupSize;
        return this;
    }
    public Long getBackupSize() {
        return this.backupSize;
    }

    public DescribeResourceDetailsResponseBody setDbInstanceStorage(Long dbInstanceStorage) {
        this.dbInstanceStorage = dbInstanceStorage;
        return this;
    }
    public Long getDbInstanceStorage() {
        return this.dbInstanceStorage;
    }

    public DescribeResourceDetailsResponseBody setDbProxyInstanceName(String dbProxyInstanceName) {
        this.dbProxyInstanceName = dbProxyInstanceName;
        return this;
    }
    public String getDbProxyInstanceName() {
        return this.dbProxyInstanceName;
    }

    public DescribeResourceDetailsResponseBody setDiskUsed(Long diskUsed) {
        this.diskUsed = diskUsed;
        return this;
    }
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    public DescribeResourceDetailsResponseBody setInstanceStorageType(String instanceStorageType) {
        this.instanceStorageType = instanceStorageType;
        return this;
    }
    public String getInstanceStorageType() {
        return this.instanceStorageType;
    }

    public DescribeResourceDetailsResponseBody setRdsEcsSecurityGroupRel(java.util.List<DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel) {
        this.rdsEcsSecurityGroupRel = rdsEcsSecurityGroupRel;
        return this;
    }
    public java.util.List<DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel> getRdsEcsSecurityGroupRel() {
        return this.rdsEcsSecurityGroupRel;
    }

    public DescribeResourceDetailsResponseBody setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeResourceDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceDetailsResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeResourceDetailsResponseBody setSecurityIPList(String securityIPList) {
        this.securityIPList = securityIPList;
        return this;
    }
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    public DescribeResourceDetailsResponseBody setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeResourceDetailsResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel extends TeaModel {
        /**
         * <p>The name of the security group.</p>
         */
        @NameInMap("SecurityGroupName")
        public String securityGroupName;

        public static DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel self = new DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel();
            return TeaModel.build(map, self);
        }

        public DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel setSecurityGroupName(String securityGroupName) {
            this.securityGroupName = securityGroupName;
            return this;
        }
        public String getSecurityGroupName() {
            return this.securityGroupName;
        }

    }

}
