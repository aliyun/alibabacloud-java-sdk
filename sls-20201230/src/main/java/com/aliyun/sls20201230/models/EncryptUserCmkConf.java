// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EncryptUserCmkConf extends TeaModel {
    /**
     * <p>RAM角色的ARN。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::13234:role/logsource</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <p>BYOK的主密钥ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f5136b95-2420-ab31-xxxxxxxxx</p>
     */
    @NameInMap("cmk_key_id")
    public String cmkKeyId;

    /**
     * <p>主密钥所在的地域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("region_id")
    public String regionId;

    public static EncryptUserCmkConf build(java.util.Map<String, ?> map) throws Exception {
        EncryptUserCmkConf self = new EncryptUserCmkConf();
        return TeaModel.build(map, self);
    }

    public EncryptUserCmkConf setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public EncryptUserCmkConf setCmkKeyId(String cmkKeyId) {
        this.cmkKeyId = cmkKeyId;
        return this;
    }
    public String getCmkKeyId() {
        return this.cmkKeyId;
    }

    public EncryptUserCmkConf setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
