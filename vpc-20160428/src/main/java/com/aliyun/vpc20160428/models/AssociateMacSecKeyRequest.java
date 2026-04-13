// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateMacSecKeyRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789ABCDEF0123456789ABCDEF</p>
     */
    @NameInMap("Cak")
    public String cak;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GCM-AES-128</p>
     */
    @NameInMap("CipherSuite")
    public String cipherSuite;

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

    public static AssociateMacSecKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateMacSecKeyRequest self = new AssociateMacSecKeyRequest();
        return TeaModel.build(map, self);
    }

    public AssociateMacSecKeyRequest setCak(String cak) {
        this.cak = cak;
        return this;
    }
    public String getCak() {
        return this.cak;
    }

    public AssociateMacSecKeyRequest setCipherSuite(String cipherSuite) {
        this.cipherSuite = cipherSuite;
        return this;
    }
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    public AssociateMacSecKeyRequest setCkn(String ckn) {
        this.ckn = ckn;
        return this;
    }
    public String getCkn() {
        return this.ckn;
    }

    public AssociateMacSecKeyRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public AssociateMacSecKeyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
