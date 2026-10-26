// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The attribute of the whitelist group.</p>
     * <ul>
     * <li>If you do not specify this parameter, the group is a regular group. This is the default value.</li>
     * <li>If you set this parameter to <code>hidden</code>, the group is a hidden group that is automatically created by the system for services such as DMS, DTS, and DAS. Hidden groups are not displayed in the console. If you delete or modify a hidden group, services such as DMS, DTS, and DAS cannot access the ApsaraDB RDS instance. Proceed with caution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    /**
     * <p>The name of the IP address whitelist group to be modified. Default value: Default. If the specified group does not exist, the system automatically creates the group.</p>
     * <blockquote>
     * <p>You can create up to 200 whitelist groups for a single instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp18n0c8zt45****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The read-only instances to which the whitelist is synchronized.</p>
     * <ul>
     * <li>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances that have read-only instances.</li>
     * <li>If multiple read-only instances exist, separate their IDs with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pgr-bp17yuz4dn3d****,pgr-bp1vn2ph54u1****</p>
     */
    @NameInMap("FreshWhiteListReadins")
    public String freshWhiteListReadins;

    /**
     * <p>The modification mode. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: overwrites the original IP address whitelist with the IP addresses specified by the <strong>SecurityIps</strong> parameter. This is the default value.</li>
     * <li><strong>Append</strong>: appends the IP addresses specified by the <strong>SecurityIps</strong> parameter to the original IP address whitelist.</li>
     * <li><strong>Delete</strong>: deletes the IP addresses specified by the <strong>SecurityIps</strong> parameter from the original IP address whitelist. You must retain at least one IP address in the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the IP address. Set the value to IPv4. IPv6 is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("SecurityIPType")
    public String securityIPType;

    /**
     * <p>The IP address whitelist. Before you modify the IP address whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP address whitelist of the instance.</p>
     * <details>
     * <summary>Configuration rules</summary>
     * 
     * <ul>
     * <li><p>You can enter IP addresses (such as 10.23.XX.XX) or CIDR blocks (such as 10.23.XX.XX/24).</p>
     * </li>
     * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). Do not add spaces before or after the commas.</p>
     * </li>
     * <li><p>You can add up to 1,000 IP addresses or CIDR blocks to the whitelist of a single instance. If you have a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
     * </details></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.23.XX.XX</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    /**
     * <p>The network type of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>MIX</strong>: the general mode. This is the default value.</li>
     * <li><strong>Classic</strong>: the classic network in the enhanced whitelist mode.</li>
     * <li><strong>VPC</strong>: the VPC in the enhanced whitelist mode.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For ApsaraDB RDS for PostgreSQL instances with cloud disks, the network type is fixed to the general mode (MIX). If you configure another mode, the system automatically changes it to the general mode.</li>
     * <li>The enhanced whitelist mode is supported only by ApsaraDB RDS for MySQL 5.1, 5.5, 5.6, and 5.7 instances with premium local SSDs, and ApsaraDB RDS for PostgreSQL 9.4 and 10 instances with premium local SSDs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MIX</p>
     */
    @NameInMap("WhitelistNetworkType")
    public String whitelistNetworkType;

    public static ModifySecurityIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIpsRequest self = new ModifySecurityIpsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayAttribute(String DBInstanceIPArrayAttribute) {
        this.DBInstanceIPArrayAttribute = DBInstanceIPArrayAttribute;
        return this;
    }
    public String getDBInstanceIPArrayAttribute() {
        return this.DBInstanceIPArrayAttribute;
    }

    public ModifySecurityIpsRequest setDBInstanceIPArrayName(String DBInstanceIPArrayName) {
        this.DBInstanceIPArrayName = DBInstanceIPArrayName;
        return this;
    }
    public String getDBInstanceIPArrayName() {
        return this.DBInstanceIPArrayName;
    }

    public ModifySecurityIpsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifySecurityIpsRequest setFreshWhiteListReadins(String freshWhiteListReadins) {
        this.freshWhiteListReadins = freshWhiteListReadins;
        return this;
    }
    public String getFreshWhiteListReadins() {
        return this.freshWhiteListReadins;
    }

    public ModifySecurityIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    public ModifySecurityIpsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySecurityIpsRequest setSecurityIPType(String securityIPType) {
        this.securityIPType = securityIPType;
        return this;
    }
    public String getSecurityIPType() {
        return this.securityIPType;
    }

    public ModifySecurityIpsRequest setSecurityIps(String securityIps) {
        this.securityIps = securityIps;
        return this;
    }
    public String getSecurityIps() {
        return this.securityIps;
    }

    public ModifySecurityIpsRequest setWhitelistNetworkType(String whitelistNetworkType) {
        this.whitelistNetworkType = whitelistNetworkType;
        return this;
    }
    public String getWhitelistNetworkType() {
        return this.whitelistNetworkType;
    }

}
