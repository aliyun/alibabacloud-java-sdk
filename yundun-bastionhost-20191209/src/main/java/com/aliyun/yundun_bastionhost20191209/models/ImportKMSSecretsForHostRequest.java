// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public Integer hostId;

    /**
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Secrets")
    public java.util.List<ImportKMSSecretsForHostRequestSecrets> secrets;

    public static ImportKMSSecretsForHostRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportKMSSecretsForHostRequest self = new ImportKMSSecretsForHostRequest();
        return TeaModel.build(map, self);
    }

    public ImportKMSSecretsForHostRequest setHostId(Integer hostId) {
        this.hostId = hostId;
        return this;
    }
    public Integer getHostId() {
        return this.hostId;
    }

    public ImportKMSSecretsForHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ImportKMSSecretsForHostRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportKMSSecretsForHostRequest setSecrets(java.util.List<ImportKMSSecretsForHostRequestSecrets> secrets) {
        this.secrets = secrets;
        return this;
    }
    public java.util.List<ImportKMSSecretsForHostRequestSecrets> getSecrets() {
        return this.secrets;
    }

    public static class ImportKMSSecretsForHostRequestSecrets extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>secret</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("SecretType")
        public String secretType;

        public static ImportKMSSecretsForHostRequestSecrets build(java.util.Map<String, ?> map) throws Exception {
            ImportKMSSecretsForHostRequestSecrets self = new ImportKMSSecretsForHostRequestSecrets();
            return TeaModel.build(map, self);
        }

        public ImportKMSSecretsForHostRequestSecrets setSecretName(String secretName) {
            this.secretName = secretName;
            return this;
        }
        public String getSecretName() {
            return this.secretName;
        }

        public ImportKMSSecretsForHostRequestSecrets setSecretType(String secretType) {
            this.secretType = secretType;
            return this;
        }
        public String getSecretType() {
            return this.secretType;
        }

    }

}
