// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeResourceDetailsResponseBody extends TeaModel {
    /**
     * <p>The storage space occupied by data backups, excluding archived backups. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>8139046912</p>
     */
    @NameInMap("BackupDataSize")
    public Long backupDataSize;

    /**
     * <p>The size of backup logs. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>21183797</p>
     */
    @NameInMap("BackupLogSize")
    public Long backupLogSize;

    /**
     * <p>The backup size. Unit: MB.</p>
     * 
     * <strong>example:</strong>
     * <p>53002759</p>
     */
    @NameInMap("BackupSize")
    public Long backupSize;

    /**
     * <p>The disk capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DbInstanceStorage")
    public Long dbInstanceStorage;

    /**
     * <p>The name of the database proxy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mr-n1m1wjrylfolvrt67s</p>
     */
    @NameInMap("DbProxyInstanceName")
    public String dbProxyInstanceName;

    /**
     * <p>The used storage space, which consists of the space occupied by data files and log files. Unit: bytes. A value of -1 indicates that no data is available.</p>
     * 
     * <strong>example:</strong>
     * <p>4871684096</p>
     */
    @NameInMap("DiskUsed")
    public Long diskUsed;

    /**
     * <p>The instance storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("InstanceStorageType")
    public String instanceStorageType;

    /**
     * <p>The RDS whitelist group specifications.</p>
     */
    @NameInMap("RdsEcsSecurityGroupRel")
    public java.util.List<DescribeResourceDetailsResponseBodyRdsEcsSecurityGroupRel> rdsEcsSecurityGroupRel;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>EA815761-F7AC-5CFE-A1AC-709D6A00B58A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmv3h25bj7yhq</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP whitelist</a> of the instance. Separate multiple entries with commas (,). Each entry must be unique. A maximum of 1,000 entries are supported. The following two formats are supported:</p>
     * <ul>
     * <li>IP address format, such as 10.10.XX.XX.</li>
     * <li>CIDR format, such as 10.10.XX.XX/24, where 24 indicates the length of the prefix in the IP address. The prefix length ranges from 1 to 32.</li>
     * </ul>
     * <p>If this parameter is not specified, the whitelist information of the default group of the original instance is used.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.1.14,172.16.1.13,172.16.1.44,172.16.1.43,172.16.1.74,172.16.1.73</p>
     */
    @NameInMap("SecurityIPList")
    public String securityIPList;

    /**
     * <p>The vSwitch ID.</p>
     * <blockquote>
     * <p>The vSwitch must belong to the same zone as the ApsaraDB RDS instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-2zelwi1jd271p670lzl8h</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>VPC ID。</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9rbibex7v0lxbeyo6at</p>
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
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_switch</p>
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
