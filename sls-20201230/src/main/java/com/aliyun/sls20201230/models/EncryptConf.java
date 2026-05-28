// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EncryptConf extends TeaModel {
    /**
     * <p>Specifies whether to enable data encryption. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The encryption algorithm. Valid values: default and sm4. If enable is set to true, you must configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("encrypt_type")
    public String encryptType;

    /**
     * <p>Optional. If you configure this parameter, the bring-your-own-key (BYOK) key is used. If you do not configure this parameter, the service key of Simple Log Service is used.</p>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;cmk_key_id&quot; : &quot;f5136b95-2420-ab31-xxxxxxxxx&quot;    &quot;arn&quot; :  &quot;acs:ram::13234:role/logsource&quot;    &quot;region_id&quot; : &quot;cn-hangzhou&quot;  }</p>
     */
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
