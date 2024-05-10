// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EncryptConf extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    @NameInMap("encrypt_type")
    public String encryptType;

    @NameInMap("user_cmk_info")
    public EncryptUserCmkConf userCmkInfo;

    public static EncryptConf build(java.util.Map<String, ?> map) throws Exception {
        EncryptConf self = new EncryptConf();
        return TeaModel.build(map, self);
    }

    public EncryptConf setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EncryptConf setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public EncryptConf setUserCmkInfo(EncryptUserCmkConf userCmkInfo) {
        this.userCmkInfo = userCmkInfo;
        return this;
    }
    public EncryptUserCmkConf getUserCmkInfo() {
        return this.userCmkInfo;
    }

}
