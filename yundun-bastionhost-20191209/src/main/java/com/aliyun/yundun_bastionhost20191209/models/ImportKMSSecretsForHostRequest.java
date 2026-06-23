// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ImportKMSSecretsForHostRequest extends TeaModel {
    /**
     * <p>The ID of the host to import the KMS secrets to.</p>
     * <blockquote>
     * <p>Only ECS hosts can import KMS secrets. You can call the <a href="https://help.aliyun.com/document_detail/200665.html">ListHosts</a> operation to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("HostId")
    public Integer hostId;

    /**
     * <p>The ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-st220aw****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region ID of the Bastionhost instance.</p>
     * <blockquote>
     * <p>For more information about region IDs and names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and availability zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The KMS secrets to import.</p>
     */
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
         * <p>The name of the KMS secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret</p>
         */
        @NameInMap("SecretName")
        public String secretName;

        /**
         * <p>The type of the KMS secret. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong>: an ECS credential.</li>
         * </ul>
         * 
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
