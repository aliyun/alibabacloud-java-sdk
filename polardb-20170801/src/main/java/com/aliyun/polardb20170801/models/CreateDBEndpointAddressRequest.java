// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBEndpointAddressRequest extends TeaModel {
    /**
     * <p>The prefix of the new endpoint. The prefix of the endpoint must meet the following requirements:</p>
     * <br>
     * <p>*   The prefix can contain lowercase letters, digits, and hyphens (-).</p>
     * <p>*   The prefix must start with a letter and end with a digit or a letter.</p>
     * <p>*   The prefix must be 6 to 40 characters in length.</p>
     */
    @NameInMap("ConnectionStringPrefix")
    public String connectionStringPrefix;

    /**
     * <p>The ID of the cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the endpoint.</p>
     * <br>
     * <p>>  You can call the [DescribeDBClusterEndpoints](~~98205~~) operation to query endpoint details.</p>
     */
    @NameInMap("DBEndpointId")
    public String DBEndpointId;

    /**
     * <p>The network type of the endpoint. Set the value to **Public**.</p>
     */
    @NameInMap("NetType")
    public String netType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the ECS security group.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The details of the zones.</p>
     */
    @NameInMap("ZoneInfo")
    public java.util.List<CreateDBEndpointAddressRequestZoneInfo> zoneInfo;

    public static CreateDBEndpointAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBEndpointAddressRequest self = new CreateDBEndpointAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBEndpointAddressRequest setConnectionStringPrefix(String connectionStringPrefix) {
        this.connectionStringPrefix = connectionStringPrefix;
        return this;
    }
    public String getConnectionStringPrefix() {
        return this.connectionStringPrefix;
    }

    public CreateDBEndpointAddressRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDBEndpointAddressRequest setDBEndpointId(String DBEndpointId) {
        this.DBEndpointId = DBEndpointId;
        return this;
    }
    public String getDBEndpointId() {
        return this.DBEndpointId;
    }

    public CreateDBEndpointAddressRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateDBEndpointAddressRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDBEndpointAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDBEndpointAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDBEndpointAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDBEndpointAddressRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateDBEndpointAddressRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBEndpointAddressRequest setZoneInfo(java.util.List<CreateDBEndpointAddressRequestZoneInfo> zoneInfo) {
        this.zoneInfo = zoneInfo;
        return this;
    }
    public java.util.List<CreateDBEndpointAddressRequestZoneInfo> getZoneInfo() {
        return this.zoneInfo;
    }

    public static class CreateDBEndpointAddressRequestZoneInfo extends TeaModel {
        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the zone.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateDBEndpointAddressRequestZoneInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateDBEndpointAddressRequestZoneInfo self = new CreateDBEndpointAddressRequestZoneInfo();
            return TeaModel.build(map, self);
        }

        public CreateDBEndpointAddressRequestZoneInfo setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateDBEndpointAddressRequestZoneInfo setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
