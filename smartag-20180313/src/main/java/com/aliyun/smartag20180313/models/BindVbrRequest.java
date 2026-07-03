// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindVbrRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Smart Access Gateway instance.</p>
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
     * <p>The instance ID of the Smart Access Gateway instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-eoqbp1fmrsgbrn****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The Alibaba Cloud account ID that owns the Smart Access Gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("SmartAGUid")
    public Long smartAGUid;

    /**
     * <p>The instance ID of the virtual border routing instance to bind.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-gc7ccdvtp3l4fec0j****</p>
     */
    @NameInMap("VbrId")
    public String vbrId;

    /**
     * <p>The region ID of the virtual border router (VBR) to bind.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VbrRegionId")
    public String vbrRegionId;

    public static BindVbrRequest build(java.util.Map<String, ?> map) throws Exception {
        BindVbrRequest self = new BindVbrRequest();
        return TeaModel.build(map, self);
    }

    public BindVbrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BindVbrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindVbrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public BindVbrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindVbrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindVbrRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public BindVbrRequest setSmartAGUid(Long smartAGUid) {
        this.smartAGUid = smartAGUid;
        return this;
    }
    public Long getSmartAGUid() {
        return this.smartAGUid;
    }

    public BindVbrRequest setVbrId(String vbrId) {
        this.vbrId = vbrId;
        return this;
    }
    public String getVbrId() {
        return this.vbrId;
    }

    public BindVbrRequest setVbrRegionId(String vbrRegionId) {
        this.vbrRegionId = vbrRegionId;
        return this;
    }
    public String getVbrRegionId() {
        return this.vbrRegionId;
    }

}
