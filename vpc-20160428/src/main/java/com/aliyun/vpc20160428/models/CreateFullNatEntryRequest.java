// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateFullNatEntryRequest extends TeaModel {
    // 需要进行转发的后端IP
    @NameInMap("AccessIp")
    public String accessIp;

    // 需要进行端口转发的内部端口，取值范围：1~65535。
    @NameInMap("AccessPort")
    public String accessPort;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("FullNatEntryDescription")
    public String fullNatEntryDescription;

    // FULLNAT规则的名称。 长度为2~128个字符，必须以大小写字母或中文开头，但不能以http://或https://开头。
    @NameInMap("FullNatEntryName")
    public String fullNatEntryName;

    // FullNAT条目所属的FullNAT列表的ID。
    @NameInMap("FullNatTableId")
    public String fullNatTableId;

    // 协议类型，取值： • TCP：转发TCP协议的报文。 • UDP：转发UDP协议的报文。
    @NameInMap("IpProtocol")
    public String ipProtocol;

    // 提供入方向访问的IP地址，该公网IP需要是当前VpcNat下的NatIP
    @NameInMap("NatIp")
    public String natIp;

    // 需要进行端口转发的外部端口，取值范围：1~65535。
    @NameInMap("NatIpPort")
    public String natIpPort;

    @NameInMap("NetworkInterfaceId")
    public String networkInterfaceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateFullNatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFullNatEntryRequest self = new CreateFullNatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateFullNatEntryRequest setAccessIp(String accessIp) {
        this.accessIp = accessIp;
        return this;
    }
    public String getAccessIp() {
        return this.accessIp;
    }

    public CreateFullNatEntryRequest setAccessPort(String accessPort) {
        this.accessPort = accessPort;
        return this;
    }
    public String getAccessPort() {
        return this.accessPort;
    }

    public CreateFullNatEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFullNatEntryRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateFullNatEntryRequest setFullNatEntryDescription(String fullNatEntryDescription) {
        this.fullNatEntryDescription = fullNatEntryDescription;
        return this;
    }
    public String getFullNatEntryDescription() {
        return this.fullNatEntryDescription;
    }

    public CreateFullNatEntryRequest setFullNatEntryName(String fullNatEntryName) {
        this.fullNatEntryName = fullNatEntryName;
        return this;
    }
    public String getFullNatEntryName() {
        return this.fullNatEntryName;
    }

    public CreateFullNatEntryRequest setFullNatTableId(String fullNatTableId) {
        this.fullNatTableId = fullNatTableId;
        return this;
    }
    public String getFullNatTableId() {
        return this.fullNatTableId;
    }

    public CreateFullNatEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateFullNatEntryRequest setNatIp(String natIp) {
        this.natIp = natIp;
        return this;
    }
    public String getNatIp() {
        return this.natIp;
    }

    public CreateFullNatEntryRequest setNatIpPort(String natIpPort) {
        this.natIpPort = natIpPort;
        return this;
    }
    public String getNatIpPort() {
        return this.natIpPort;
    }

    public CreateFullNatEntryRequest setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public CreateFullNatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateFullNatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateFullNatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateFullNatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateFullNatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
