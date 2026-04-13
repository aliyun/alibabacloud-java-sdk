// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisassociateMacSecKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789ABCDEF0123456789ABCDEF</p>
     */
    @NameInMap("Ckn")
    public String ckn;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1hp0wr072f6****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisassociateMacSecKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateMacSecKeyRequest self = new DisassociateMacSecKeyRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateMacSecKeyRequest setCkn(String ckn) {
        this.ckn = ckn;
        return this;
    }
    public String getCkn() {
        return this.ckn;
    }

    public DisassociateMacSecKeyRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public DisassociateMacSecKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
