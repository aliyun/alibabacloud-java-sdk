// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the batch modification mode. Valid values:</p>
     * <p>true: batch mode. Modifies multiple whitelist groups at a time based on the GroupItems parameter. In this case, the single-group parameters such as SecurityIps, DBInstanceIPArrayName, and DBInstanceIPArrayAttribute do not take effect.</p>
     * <p>false: single-group mode. Modifies a single whitelist group based on parameters such as SecurityIps. This is the default value.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BatchMode")
    public Boolean batchMode;

    /**
     * <p>The attribute of the IP whitelist group.</p>
     * <ul>
     * <li>If you do not specify this parameter, the group is a regular group. This is the default value.</li>
     * <li>If you set this parameter to <code>hidden</code>, the group is a system-generated group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Deleting or modifying these groups causes services such as DMS, DTS, and DAS to fail to access the ApsaraDB RDS instance. Proceed with caution.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hidden</p>
     */
    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    /**
     * <p>The name of the IP whitelist group to be modified. Default value: Default. If the specified group does not exist, the system automatically creates the group.</p>
     * <blockquote>
     * <p>A single instance supports up to 200 IP whitelist groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The instance ID of the target instance.</p>
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
     * <li>This parameter applies only to ApsaraDB RDS for PostgreSQL instances for which read-only instances are created.</li>
     * <li>If multiple read-only instances exist, separate their IDs with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pgr-bp17yuz4dn3d****,pgr-bp1vn2ph54u1****</p>
     */
    @NameInMap("FreshWhiteListReadins")
    public String freshWhiteListReadins;

    /**
     * <p>The details of the whitelist groups. This parameter is required when BatchMode is set to true. In each group, GroupName is required and must be unique. You must specify at least one of SecurityIPList and GroupTag.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;GroupName&quot;:&quot;default&quot;,&quot;SecurityIPList&quot;:&quot;127.0.0.1&quot;},{&quot;GroupName&quot;:&quot;test&quot;,&quot;SecurityIPList&quot;:&quot;10.23.XX.XX,10.24.XX.XX&quot;}]</p>
     */
    @NameInMap("GroupItems")
    public java.util.List<ModifySecurityIpsRequestGroupItems> groupItems;

    /**
     * <p>The modification mode. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: overwrites the original IP whitelist with the value of the <strong>SecurityIps</strong> parameter. This is the default value.</li>
     * <li><strong>Append</strong>: appends the IP addresses specified in the <strong>SecurityIps</strong> parameter to the original IP whitelist.</li>
     * <li><strong>Delete</strong>: deletes the IP addresses specified in the <strong>SecurityIps</strong> parameter from the original IP whitelist. You must retain at least one IP address.</li>
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
     * <p>The IP whitelist. Before you modify the IP whitelist, call the <a href="https://help.aliyun.com/document_detail/610518.html">DescribeDBInstanceIPArrayList</a> operation to query the existing IP whitelist of the instance.</p>
     * <details>
     * <summary>Configuration rules</summary>
     * 
     * <ul>
     * <li><p>IP addresses (such as 10.23.XX.XX) and CIDR blocks (such as 10.23.XX.XX/24) are supported.</p>
     * </li>
     * <li><p>Separate multiple IP addresses or CIDR blocks with commas (,). Do not add spaces before or after the commas.</p>
     * </li>
     * <li><p>You can add up to 1,000 IP addresses or CIDR blocks to a single instance. If you have a large number of IP addresses, we recommend that you merge scattered IP addresses into CIDR blocks, such as 10.23.XX.XX/24.</p>
     * </details></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10.23.XX.XX</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    /**
     * <p>The network type of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>MIX</strong>: general mode. This is the default value.</li>
     * <li><strong>Classic</strong>: classic network in enhanced whitelist mode.</li>
     * <li><strong>VPC</strong>: VPC in enhanced whitelist mode.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For ApsaraDB RDS for PostgreSQL instances with cloud disks, the network type is fixed to MIX. If you configure another mode, the system automatically converts it to MIX.</li>
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

    public ModifySecurityIpsRequest setBatchMode(Boolean batchMode) {
        this.batchMode = batchMode;
        return this;
    }
    public Boolean getBatchMode() {
        return this.batchMode;
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

    public ModifySecurityIpsRequest setGroupItems(java.util.List<ModifySecurityIpsRequestGroupItems> groupItems) {
        this.groupItems = groupItems;
        return this;
    }
    public java.util.List<ModifySecurityIpsRequestGroupItems> getGroupItems() {
        return this.groupItems;
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

    public static class ModifySecurityIpsRequestGroupItems extends TeaModel {
        /**
         * <p>The name of the whitelist group. This parameter is required in batch mode and must be unique within the same GroupItems list.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The attribute of the whitelist group. If you set this parameter to hidden, the group is a system-generated group used by services such as DMS, DTS, and DAS. These groups are not displayed in the console. Proceed with caution. Generally, you do not need to specify this parameter. You must specify at least one of this parameter and SecurityIPList.</p>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        @NameInMap("GroupTag")
        public String groupTag;

        /**
         * <p>The modified IP address whitelist of the group. Separate multiple IP addresses with commas (,). You must specify at least one of this parameter and GroupTag.</p>
         * 
         * <strong>example:</strong>
         * <p>10.23.XX.XX,10.24.XX.XX</p>
         */
        @NameInMap("SecurityIPList")
        public String securityIPList;

        public static ModifySecurityIpsRequestGroupItems build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIpsRequestGroupItems self = new ModifySecurityIpsRequestGroupItems();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIpsRequestGroupItems setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ModifySecurityIpsRequestGroupItems setGroupTag(String groupTag) {
            this.groupTag = groupTag;
            return this;
        }
        public String getGroupTag() {
            return this.groupTag;
        }

        public ModifySecurityIpsRequestGroupItems setSecurityIPList(String securityIPList) {
            this.securityIPList = securityIPList;
            return this;
        }
        public String getSecurityIPList() {
            return this.securityIPList;
        }

    }

}
