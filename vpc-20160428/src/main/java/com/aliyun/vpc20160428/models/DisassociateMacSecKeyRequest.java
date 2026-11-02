// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DisassociateMacSecKeyRequest extends TeaModel {
    /**
     * <p>The name of the key. Only hexadecimal characters are supported, and lowercase letters are automatically converted to uppercase letters. The length must be 32 hexadecimal characters when the encryption algorithm is GCM-AES-128 or GCM-AES-XPN-128, and 64 hexadecimal characters when the encryption algorithm is GCM-AES-256 or GCM-AES-XPN-256. The value must be the name of a key that has been associated with the target Express Connect circuit by calling the AssociateMacSecKey operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0123456789ABCDEF0123456789ABCDEF</p>
     */
    @NameInMap("Ckn")
    public String ckn;

    /**
     * <p>The ID of the Express Connect circuit. The Express Connect circuit must be in the <strong>Enabled</strong> state and its <strong>BusinessStatus</strong> must be <strong>Normal</strong>. You can call the DescribePhysicalConnections operation to query the status.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1hp0wr072f6****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The region ID of the Express Connect circuit. You can call the <a href="https://help.aliyun.com/document_detail/448570.html">DescribeRegions</a> operation to query region IDs.</p>
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
