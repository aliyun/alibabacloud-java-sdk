// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class ContainerConfiguration extends TeaModel {
    /**
     * <p>The ID of the Container Registry Enterprise instance. This parameter is required when registryType is set to acree.</p>
     * 
     * <strong>example:</strong>
     * <p>cri-****</p>
     */
    @NameInMap("acrInstanceId")
    public String acrInstanceId;

    /**
     * <p>The address of the sandbox base image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/sandbox-demo/python:3.12</p>
     */
    @NameInMap("image")
    public String image;

    /**
     * <p>The repository access credentials used to pull images. You do not need to configure this parameter when you use public images.</p>
     */
    @NameInMap("registryCredential")
    public ContainerConfigurationRegistryCredential registryCredential;

    public static ContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ContainerConfiguration self = new ContainerConfiguration();
        return TeaModel.build(map, self);
    }

    public ContainerConfiguration setAcrInstanceId(String acrInstanceId) {
        this.acrInstanceId = acrInstanceId;
        return this;
    }
    public String getAcrInstanceId() {
        return this.acrInstanceId;
    }

    public ContainerConfiguration setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public ContainerConfiguration setRegistryCredential(ContainerConfigurationRegistryCredential registryCredential) {
        this.registryCredential = registryCredential;
        return this;
    }
    public ContainerConfigurationRegistryCredential getRegistryCredential() {
        return this.registryCredential;
    }

    public static class ContainerConfigurationRegistryCredential extends TeaModel {
        /**
         * <p>The logon password or access token for the image repository. The value is encrypted and stored on the server, and plaintext is not returned in query responses.</p>
         * 
         * <strong>example:</strong>
         * <p>Passw0rd****</p>
         */
        @NameInMap("password")
        public String password;

        /**
         * <p>The logon username for the image repository.</p>
         * 
         * <strong>example:</strong>
         * <p>sandbox-puller</p>
         */
        @NameInMap("username")
        public String username;

        public static ContainerConfigurationRegistryCredential build(java.util.Map<String, ?> map) throws Exception {
            ContainerConfigurationRegistryCredential self = new ContainerConfigurationRegistryCredential();
            return TeaModel.build(map, self);
        }

        public ContainerConfigurationRegistryCredential setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ContainerConfigurationRegistryCredential setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

}
