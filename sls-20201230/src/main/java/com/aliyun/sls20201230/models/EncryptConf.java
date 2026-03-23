// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EncryptConf extends TeaModel {
    /**
     * <p>是否启用数据加密。</p>
     * <ul>
     * <li>true：是</li>
     * <li>false：否</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>加密算法类型，支持 default、m4、sm4_ecb、sm4_cbc、sm4_gcm、aes_ecb、aes_cbc、aes_cfb、aes_ofb、aes_gcm。当enable为true时，此项必选。</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("encrypt_type")
    public String encryptType;

    /**
     * <p>可选字段。如果设置该字段，则表示使用自带密钥（BYOK），否则使用日志服务的服务密钥。</p>
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
