// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The attribute of the whitelist group.</p>
     * <ul>
     * <li>(Default) If you do not specify this parameter, the group is a common group.</li>
     * <li>If you set this parameter to <code>hidden</code>, the group is a system default group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Deleting or modifying these groups may prevent DMS, DTS, and DAS from accessing ApsaraDB RDS. Proceed with caution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    /**
     * <p>The name of the whitelist group to modify. Default value: Default. If the specified group does not exist, a new group is automatically created.</p>
     * <blockquote>
     * <p>Each instance supports up to 200 whitelist groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp18n0c8zt45****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The list of read-only instances to which the whitelist is synchronized.</p>
     * <ul>
     * <li>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances that have read-only instances.</li>
     * <li>Separate multiple read-only instances with commas (,).</li>
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
     * <li><strong>Cover</strong> (default): overwrites the original IP whitelist with the value of the <strong>SecurityIps</strong> parameter.</li>
     * <li><strong>Append</strong>: appends the IP addresses specified in the <strong>SecurityIps</strong> parameter to the original IP whitelist.</li>
     * <li><strong>Delete</strong>: removes the IP addresses specified in the <strong>SecurityIps</strong> parameter from the original IP whitelist. At least one IP address must be retained.</li>
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
     * <p>The type of IP address. The value is fixed as IPv4. IPv6 is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>IPv4</p>
     */
    @NameInMap("SecurityIPType")
    public String securityIPType;

    /**
     * <p>The IP whitelist. Before you modify the IP whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP whitelist information of the instance.</p>
     * <details>
     * <summary>Configuration rules</summary>
     * 
     * <ul>
     * <li><p>IP addresses (such as 10.23.XX.XX) and CIDR blocks (such as 10.23.XX.XX/24) are supported.</p>
     * </li>
     * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). No spaces are allowed before or after the commas.</p>
     * </li>
     * <li><p>Each instance can contain up to 1,000 IP addresses or CIDR blocks. If you have a large number of IP addresses, merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
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
     * <li><strong>MIX</strong> (default): general mode.</li>
     * <li><strong>Classic</strong>: the classic network in enhanced whitelist mode.</li>
     * <li><strong>VPC</strong>: the virtual private cloud (VPC) in enhanced whitelist mode.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>ApsaraDB RDS for PostgreSQL instances with cloud disks use only the general mode (MIX). If you set this parameter to another mode, the value is automatically converted to MIX.</li>
     * <li>Only ApsaraDB RDS for MySQL 5.1, 5.5, 5.6, and 5.7 instances with Premium Local SSDs and ApsaraDB RDS for PostgreSQL 9.4 and 10 instances with Premium Local SSDs support the enhanced whitelist mode.</li>
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
