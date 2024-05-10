// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EncryptUserCmkConf extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arn")
    public String arn;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("cmk_key_id")
    public String cmkKeyId;

    /**
     * <p>This parameter is required.</p>
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
