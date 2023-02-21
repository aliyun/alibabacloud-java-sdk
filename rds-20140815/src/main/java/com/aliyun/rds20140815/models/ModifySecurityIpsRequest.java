// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifySecurityIpsRequest extends TeaModel {
    /**
     * <p>The attribute of the IP address allowlist. By default, this parameter is empty.</p>
     * <br>
     * <p>>  The IP address allowlists that have the hidden attribute are not displayed in the ApsaraDB RDS console. These IP address allowlists are used to access Alibaba Cloud services, such as Data Transmission Service (DTS).</p>
     */
    @NameInMap("DBInstanceIPArrayAttribute")
    public String DBInstanceIPArrayAttribute;

    /**
     * <p>The name of the IP address allowlist that you want to modify. Default value: Default.</p>
     * <br>
     * <p>>  A maximum of 200 IP address allowlists can be configured for each instance.</p>
     */
    @NameInMap("DBInstanceIPArrayName")
    public String DBInstanceIPArrayName;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The read-only instances to which you want to synchronize the IP address allowlist.</p>
     * <br>
     * <p>*   This parameter applies only to ApsaraDB RDS for PostgreSQL instances.</p>
     * <p>*   If the instance is attached with a read-only instance, you can use this parameter to synchronize the IP address allowlist to the read-only instance. If the instance is attached with multiple read-only instances, the read-only instances must be separated by commas (,).</p>
     * <p>*   If the instance is not attached with a read-only instance, this parameter is empty.</p>
     */
    @NameInMap("FreshWhiteListReadins")
    public String freshWhiteListReadins;

    /**
     * <p>The method that is used to modify the IP address allowlist. Valid values:</p>
     * <br>
     * <p>*   **Cover**: Use the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter to overwrite the existing IP addresses and CIDR blocks in the IP address allowlist.</p>
     * <p>*   **Append**: Add the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter to the IP address allowlist.</p>
     * <p>*   **Delete**: Delete the IP addresses and CIDR blocks that are specified in the **SecurityIps** parameter from the IP address allowlist. You must retain at least one IP address or CIDR block.</p>
     * <br>
     * <p>Default value: **Cover**.</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of IP address in the IP address allowlist.</p>
     * <br>
     * <p>The value is fixed as IPv4.</p>
     */
    @NameInMap("SecurityIPType")
    public String securityIPType;

    /**
     * <p>The IP addresses and CIDR blocks that you want to include in the IP address allowlist. If the IP address allowlist contains more than one IP address or CIDR block, separate these IP addresses and CIDR blocks with commas (,). Each IP address or CIDR block in the IP address allowlist must be unique. For more information, see [Configure an IP address allowlist for an ApsaraDB RDS instance](~~43185~~). The entries in the IP address allowlist must be in one of the following formats:</p>
     * <br>
     * <p>*   IP addresses, such as 10.23.XX.XX.</p>
     * <p>*   CIDR blocks, such as 10.23.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address allowlist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</p>
     * <br>
     * <p>>  A maximum of 1,000 IP addresses and CIDR blocks can be configured for each instance. If you want to add a large number of IP addresses, we recommend that you merge them into CIDR blocks, such as 10.23.XX.XX/24.</p>
     */
    @NameInMap("SecurityIps")
    public String securityIps;

    /**
     * <p>The network type of the IP address allowlist. Valid values:</p>
     * <br>
     * <p>*   **Classic**: classic network in enhanced allowlist mode</p>
     * <p>*   **VPC**: virtual private cloud (VPC) network type in enhanced allowlist mode.</p>
     * <p>*   **MIX**: standard allowlist mode.</p>
     * <br>
     * <p>Default value: **MIX**.</p>
     * <br>
     * <p>>  In standard allowlist mode, IP addresses and CIDR blocks are added only to the default IP address allowlist. In enhanced allowlist mode, IP addresses and CIDR blocks are added to the IP address allowlists of the classic network type and those of the VPC network type.</p>
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
