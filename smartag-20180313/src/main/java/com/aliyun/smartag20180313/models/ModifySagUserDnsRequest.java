// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySagUserDnsRequest extends TeaModel {
    /**
     * <p>The IP address of the primary DNS server.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the IP address of the existing DNS server will be cleared.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.1</p>
     */
    @NameInMap("MasterDns")
    public String masterDns;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the SAG instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The IP address of the secondary DNS server.</p>
     * <blockquote>
     * <p> If you do not set this parameter, the IP address of the existing DNS server will be cleared.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.2</p>
     */
    @NameInMap("SlaveDns")
    public String slaveDns;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-whfn****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The serial number of the SAG device associated with the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag32a30****</p>
     */
    @NameInMap("SmartAGSn")
    public String smartAGSn;

    public static ModifySagUserDnsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySagUserDnsRequest self = new ModifySagUserDnsRequest();
        return TeaModel.build(map, self);
    }

    public ModifySagUserDnsRequest setMasterDns(String masterDns) {
        this.masterDns = masterDns;
        return this;
    }
    public String getMasterDns() {
        return this.masterDns;
    }

    public ModifySagUserDnsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifySagUserDnsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySagUserDnsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifySagUserDnsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySagUserDnsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySagUserDnsRequest setSlaveDns(String slaveDns) {
        this.slaveDns = slaveDns;
        return this;
    }
    public String getSlaveDns() {
        return this.slaveDns;
    }

    public ModifySagUserDnsRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifySagUserDnsRequest setSmartAGSn(String smartAGSn) {
        this.smartAGSn = smartAGSn;
        return this;
    }
    public String getSmartAGSn() {
        return this.smartAGSn;
    }

}
