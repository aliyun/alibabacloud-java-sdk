// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateLogStoreEncryptionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("encryptType")
    public String encryptType;

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
         * <strong>example:</strong>
         * <p>f5136b95-2420-ab31-xxxxxxxxx</p>
         */
        @NameInMap("keyId")
        public String keyId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
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
