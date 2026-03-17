// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class AddDnatEntryRequest extends TeaModel {
    /**
     * <p>The public IP address.</p>
     * <blockquote>
     * <p> If the DNAT entry is used to forward packets transmitted over the Internet, the DNAT entry automatically recognizes the current public IP address.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.10.1.xx</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>The public port.</p>
     * <p>Valid values: <strong>1 to 65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    /**
     * <p>The destination private IP address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The destination private port.</p>
     * <p>Valid values: <strong>1 to 65535</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The protocol used in DNAT. Valid values:</p>
     * <ul>
     * <li><strong>TCP</strong>: forwards TCP packets.</li>
     * <li><strong>UDP</strong>: The NAT gateway forwards UDP packets.</li>
     * <li><strong>Any</strong>: forwards packets of all protocols.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TCP</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the SAG instance.</p>
     * <blockquote>
     * <p> Only SAG instances used to manage SAG devices support DNAT.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-kdhg*******</p>
     */
    @NameInMap("SagId")
    public String sagId;

    /**
     * <p>The type of the DNAT entry. Valid values:</p>
     * <ul>
     * <li><strong>Intranet</strong>: translates the destination IP address to a specific internal IP address. This is the default value.</li>
     * <li><strong>Internet</strong>: translates the destination IP address to a specific public IP address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Intranet</p>
     */
    @NameInMap("Type")
    public String type;

    public static AddDnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDnatEntryRequest self = new AddDnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public AddDnatEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public AddDnatEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public AddDnatEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public AddDnatEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public AddDnatEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public AddDnatEntryRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddDnatEntryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddDnatEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddDnatEntryRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddDnatEntryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddDnatEntryRequest setSagId(String sagId) {
        this.sagId = sagId;
        return this;
    }
    public String getSagId() {
        return this.sagId;
    }

    public AddDnatEntryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
