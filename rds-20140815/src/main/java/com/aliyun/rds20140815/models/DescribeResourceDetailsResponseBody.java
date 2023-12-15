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
     * <p>The size of the backup log. Unit: bytes.</p>
     */
    @NameInMap("BackupLogSize")
    public Long backupLogSize;

    /**
     * <p>The size of the backup data. Unit: MB.</p>
     */
    @NameInMap("BackupSize")
    public Long backupSize;

    /**
     * <p>The disk capacity of the instance.</p>
     */
    @NameInMap("DbInstanceStorage")
    public Long dbInstanceStorage;

    /**
     * <p>The name of the proxy instance.</p>
     */
    @NameInMap("DbProxyInstanceName")
    public String dbProxyInstanceName;

    /**
     * <p>The total storage used. The value is the sum of the DataSize and LogSize values. Unit: bytes. The value -1 indicates that no data files or log files are stored.</p>
     */
    @NameInMap("DiskUsed")
    public Long diskUsed;

    /**
     * <p>The storage type of the instance.</p>
     */
    @NameInMap("InstanceStorageType")
    public String instanceStorageType;

    /**
     * <p>The rule for the IP address whitelist of the instance.</p>
     */
    @NameInMap("RdsEcsSecurityGroupRel")
    public java.util.List<DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The IP address whitelist of the instance. For more information, see [Configure IP address whitelists](~~43185~~). If the returned IP address whitelist contains more than one entry, these entries are separated with commas (,). Each entry is unique and up to 1,000 entries are returned. The entries in the IP address whitelist must be in one of the following formats:</p>
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
     * <br>
     * <p>>  The vSwitch must belong to the same zone as the instance.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
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
