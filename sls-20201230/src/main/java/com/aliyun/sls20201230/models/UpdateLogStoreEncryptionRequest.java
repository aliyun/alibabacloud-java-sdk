// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreEncryptionRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the encryption feature. After you update the encryption configuration of the Logstore, you can modify only the enable parameter in subsequent update requests. You cannot modify the encryptType or userCmkInfo parameters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>The encryption algorithm. Valid values: default, m4, sm4_ecb, sm4_cbc, sm4_gcm, aes_ecb, aes_cbc, aes_cfb, aes_ofb, and aes_gcm.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("encryptType")
    public String encryptType;

    /**
     * <p>Optional. If you use a BYOK key to encrypt logs, you must specify this parameter. If you use the service key of Simple Log Service to encrypt logs, you do not need to specify this parameter.</p>
     */
    @NameInMap("userCmkInfo")
    public UpdateLogStoreEncryptionRequestUserCmkInfo userCmkInfo;

    public static UpdateLogStoreEncryptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogStoreEncryptionRequest self = new UpdateLogStoreEncryptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogStoreEncryptionRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateLogStoreEncryptionRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public UpdateLogStoreEncryptionRequest setUserCmkInfo(UpdateLogStoreEncryptionRequestUserCmkInfo userCmkInfo) {
        this.userCmkInfo = userCmkInfo;
        return this;
    }
    public UpdateLogStoreEncryptionRequestUserCmkInfo getUserCmkInfo() {
        return this.userCmkInfo;
    }

    public static class UpdateLogStoreEncryptionRequestUserCmkInfo extends TeaModel {
        /**
         * <p>The ID of the CMK to which the BYOK key belongs. You can create a CMK in KMS. The CMK must be in the same region as the endpoint of Simple Log Service.</p>
         * 
         * <strong>example:</strong>
         * <p>f5136b95-2420-ab31-xxxxxxxxx</p>
         */
        @NameInMap("keyId")
        public String keyId;

        /**
         * <p>The region ID. Example: cn-hangzhou.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role.The value is in the acs:ram::12344\<em>\</em>\*:role/xxxxx format. To use a BYOK key to encrypt logs, you must create a RAM role and grant the AliyunKMSReadOnlyAccess and AliyunKMSCryptoUserAccess permissions to the RAM role. You must grant the API caller the PassRole permission on the RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::12344***:role/xxxxx</p>
         */
        @NameInMap("roleArn")
        public String roleArn;

        public static UpdateLogStoreEncryptionRequestUserCmkInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogStoreEncryptionRequestUserCmkInfo self = new UpdateLogStoreEncryptionRequestUserCmkInfo();
            return TeaModel.build(map, self);
        }

        public UpdateLogStoreEncryptionRequestUserCmkInfo setKeyId(String keyId) {
            this.keyId = keyId;
            return this;
        }
        public String getKeyId() {
            return this.keyId;
        }

        public UpdateLogStoreEncryptionRequestUserCmkInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateLogStoreEncryptionRequestUserCmkInfo setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

}
